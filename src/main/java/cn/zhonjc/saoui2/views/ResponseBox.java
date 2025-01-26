package cn.zhonjc.saoui2.views;

import cn.zhonjc.saoui2.constants.Styles;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ResponseBox {
    VBox box;

    private String title = "Info";

    private String message = "This is a demo";

    private boolean decision = false;

    public ResponseBox(){
        prepare();
    }

    public ResponseBox(String title, String message, boolean decision){
        this.title = title;
        this.message = message;
        this.decision = decision;
        prepare();

    }

    private void prepare(){
        box = new VBox();
        Text topText = new Text(title);
        topText.setFont(Styles.getFont(20));
        StackPane top = new StackPane();
        top.getChildren().add(topText);
        box.getChildren().add(top);
    }

    public void addingTo(Pane aim){
        aim.getChildren().add(box);
    }

    public void exit(){

    }

}
