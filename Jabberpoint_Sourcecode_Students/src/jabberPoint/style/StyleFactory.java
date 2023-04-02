package jabberPoint.style;

import java.awt.*;

public abstract class StyleFactory {
    private static final String FONTNAME = "Helvetica";

    public static Style createStyle(StyleLevel level) throws LevelNotImplementedException{
        switch(level){
            case ZERO -> {return new Style(0, Color.red,   48, 20);}
            case ONE -> {return new Style(20, Color.blue,  40, 10);}
            case TWO -> {return new Style(50, Color.black, 36, 10);}
            case THREE -> {return new Style(70, Color.black, 30, 10);}
            case FOUR -> {return new Style(90, Color.black, 24, 10);}
        }
        throw new LevelNotImplementedException();
    }

    //font for a style
    public static Font createFont(int fontSize){
        return new Font(StyleFactory.FONTNAME, Font.BOLD, fontSize);
    }

    //regular font
    public static Font createFont(String fontName, int style, int fontSize){
        return new Font(fontName, style, fontSize);
    }
}
