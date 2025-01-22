module cn.zhonjc.saoui2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cn.zhonjc.saoui2 to javafx.fxml;
    exports cn.zhonjc.saoui2;
}