package jabberPoint;

import jabberPoint.interfaces.LoadAble;
import jabberPoint.interfaces.SaveAble;
import jabberPoint.style.StyleLevel;
import jdk.jfr.Label;

import java.io.IOException;

/** A built-in demo presentation
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class DemoPresentation implements SaveAble, LoadAble {

	public void loadFile(SlideViewerComponent slideViewerComponent, String unusedFilename) {
		Presentation presentation = slideViewerComponent.getPresentation();
		presentation.setTitle("Demo Presentation");
		Slide slide;
		slide = new Slide();
		slide.setTitle("JabberPoint");
		slide.append(StyleLevel.ONE, "The Java prestentation tool");
		slide.append(StyleLevel.TWO, "Copyright (c) 1996-2000: Ian Darwin");
		slide.append(StyleLevel.TWO, "Copyright (c) 2000-now:");
		slide.append(StyleLevel.TWO, "Gert Florijn and Sylvia Stuurman");
		slide.append(StyleLevel.FOUR, "Calling Jabberpoint without a filename");
		slide.append(StyleLevel.FOUR, "will show this presentation");
		slide.append(StyleLevel.ONE, "Navigate:");
		slide.append(StyleLevel.THREE, "Next slide: PgDn or Enter");
		slide.append(StyleLevel.THREE, "Previous slide: PgUp or up-arrow");
		slide.append(StyleLevel.THREE, "Quit: q or Q");
		presentation.append(slide);

		slide = new Slide();
		slide.setTitle("Demonstration of levels and styles");
		slide.append(StyleLevel.ONE, "Level 1");
		slide.append(StyleLevel.TWO, "Level 2");
		slide.append(StyleLevel.ONE, "Again level 1");
		slide.append(StyleLevel.ONE, "Level 1 has style number 1");
		slide.append(StyleLevel.TWO, "Level 2 has style number 2");
		slide.append(StyleLevel.THREE, "This is how level 3 looks like");
		slide.append(StyleLevel.FOUR, "And this is level 4");
		presentation.append(slide);

		slide = new Slide();
		slide.setTitle("The third slide");
		slide.append(StyleLevel.ONE, "To open a new presentation,");
		slide.append(StyleLevel.TWO, "use File->Open from the menu.");
		slide.append(StyleLevel.ONE, " ");
		slide.append(StyleLevel.ONE, "This is the end of the presentation.");
		slide.append(new BitmapItem(StyleLevel.ONE, "JabberPoint.jpg"));
		presentation.append(slide);
	}

	public void saveFile(SlideViewerComponent slideViewerComponent, String unusedFilename) throws IOException {
		throw new IllegalStateException("Save As->Demo! called");
	}
}
