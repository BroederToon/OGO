package jabberPoint.interfaces;

import jabberPoint.presentation.SlideViewerComponent;

import java.io.IOException;

public interface LoadAble {

    void loadFile(SlideViewerComponent slideViewerComponent, String fileName) throws IOException;
}
