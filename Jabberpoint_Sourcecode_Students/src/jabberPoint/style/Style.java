package jabberPoint.style;

import java.awt.Color;
import java.awt.Font;

/** <p>Style stands for Indent, Color, Font and Leading.</p>
 * <p>The link between a style number and a item level is hard-linked:
 * in Slide the style is grabbed for an item
 * with a style number the same as the item level.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class Style {
	private final Font font;
	private int indent;
	private Color color;
	private int leading;

	public Style(int indent, Color color, int points, int leading) {
		this.font = StyleFactory.createFont(points);
		this.indent = indent;
		this.color = color;
		this.leading = leading;
	}

	public String toString() {
		return "["+ indent + "," + color + "; " + this.font.getSize() + " on " + leading +"]";
	}

	public Font getFont(float scale) {
		return font.deriveFont(this.font.getSize() * scale);
	}

	public Font getFont() {
		return font;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getLeading() {
		return leading;
	}

	public void setLeading(int leading) {
		this.leading = leading;
	}
}
