package jabberPoint.interfaces;

import jabberPoint.presentation.SlideViewerComponent;

import java.io.IOException;

public interface SaveAble {

    void saveFile(SlideViewerComponent slideViewerComponent, String fileName) throws IOException;
}
