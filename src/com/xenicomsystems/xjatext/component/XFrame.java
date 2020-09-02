package com.xenicomsystems.xjatext.component;

/**
 * 
 * @author Saul Pelan
 * 
 *         The XFrame serves as the main parent element.
 *
 *
 */
public class XFrame {
	private int length;
	private int height;

	public XFrame(final int length, final int height) {
		this.setLength(length);
		this.setHeight(height);
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
}
