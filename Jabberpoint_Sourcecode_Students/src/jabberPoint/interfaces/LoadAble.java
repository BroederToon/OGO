package jabberPoint.interfaces;

import jabberPoint.Presentation;
import jabberPoint.SlideViewerComponent;

import java.io.IOException;

public interface LoadAble {

    void loadFile(SlideViewerComponent slideViewerComponent, String fileName) throws IOException;
}
