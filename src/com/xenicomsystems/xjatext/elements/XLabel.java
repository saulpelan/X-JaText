package com.xenicomsystems.xjatext.elements;

/**
 * @author Saul Pelan
 *
 */
public class XLabel {
	private String text;
	private int length;

	/**
	 * Constructs a XLabel with the specified text and uses the length of the
	 * {@code text} string as the element length.
	 * 
	 * @param text the text to display
	 */
	public XLabel(final String text) {
		this(text, text.length());
	}

	/**
	 * Constructs a XLabel with the specified text and length.
	 * 
	 * @param text the text to display           
	 * @param length the length of the label
	 */
	public XLabel(final String text, final int length) {
		this.setText(text);
		this.setLength(length);
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}
