package jabberPoint.interfaces;

import jabberPoint.Presentation;

import java.io.IOException;

public interface LoadAble {

    void loadFile(Presentation presentation, String fileName) throws IOException;
}
