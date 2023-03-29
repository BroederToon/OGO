package jabberPoint.interfaces;

import jabberPoint.Presentation;

import java.io.IOException;

public interface SaveAble {

    void saveFile(Presentation presentation, String fileName) throws IOException;
}
