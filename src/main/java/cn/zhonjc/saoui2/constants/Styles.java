package cn.zhonjc.saoui2.constants;

import cn.zhonjc.saoui2.HelloApplication;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.InputStream;

public class Styles {
    public static final Color FRONTCOLOR = Color.web("#FFB800");
    public static final Color BACKCOLOR = Color.web("#C4C4C4");
    private static Font BOLDFONT;


    public static Font getFont(double size){
        InputStream fontStream = HelloApplication.class.getResourceAsStream("fonts/SAOUI-Bold.otf");
        return Font.loadFont(fontStream, size);
    }
}
