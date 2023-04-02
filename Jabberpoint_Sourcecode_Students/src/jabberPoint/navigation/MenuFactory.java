package jabberPoint.navigation;

import jabberPoint.presentation.SlideViewerComponent;
import jabberPoint.presentation.SlideViewerFrame;

public abstract class MenuFactory {
    public static KeyController createKeyController(SlideViewerComponent slideViewerComponent){
        return new KeyController(slideViewerComponent);
    }

    public static MenuController createMenuController(SlideViewerFrame frame){
        return new MenuController(frame);
    }
}
