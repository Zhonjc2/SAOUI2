package cn.zhonjc.saoui2.utils;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

public class GridLayout extends Pane {
    private final int rows;
    private final int cols;

    public GridLayout(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    protected void layoutChildren() {
        double cellWidth = getWidth() / cols; // 每列宽度
        double cellHeight = getHeight() / rows; // 每行高度

        for (Node child : getChildren()) {
            GridData data = (GridData) child.getProperties().get("grid-data");
            if (data != null) {
                // 计算组件的宽高和位置
                double x = cellWidth * data.col;
                double y = cellHeight * data.row;
                double width = cellWidth * data.colSpan;
                double height = cellHeight * data.rowSpan;

                child.resizeRelocate(x, y, width, height);
            }
        }
    }

    public void add(Node child, int row, int col, int rowSpan, int colSpan) {
        GridData data = new GridData(row, col, rowSpan, colSpan);
        child.getProperties().put("grid-data", data);
        getChildren().add(child);
    }

    private static class GridData {
        int row, col, rowSpan, colSpan;

        public GridData(int row, int col, int rowSpan, int colSpan) {
            this.row = row;
            this.col = col;
            this.rowSpan = rowSpan;
            this.colSpan = colSpan;
        }
    }
}

