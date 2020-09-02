package com.xenicomsystems.xjatext.component;

public class XComponent {
	private int length;
	private int height;
	private String name;
	private XComponent[] components;
	private XComponent parent;

	public XComponent() {
		this.components = new XComponent[0];
	}

	public void addComponent(XComponent component) {
		final XComponent[] components = this.components;
		this.components = new XComponent[components.length + 1];
		int i;
		for (i = 0; i < components.length; i++) {
			this.components[i] = components[i];
		}
		this.components[i + 1] = component;
		component.setParent(this);
	}
	
	private void removeComponent(XComponent component) {
		final XComponent[] components = this.components;
		this.components = new XComponent[components.length - 1];
		for (int i = 0; i < this.components.length; i++) {
			if (components[i] != component) {
				this.components[i] = components[i];
			}
		}
	}

	public void delete() {
		XComponent parent = getParent();
		parent.removeComponent(this);
		setParent(null);
	}

	public XComponent getComponent(int index) {
		return getComponents()[index];
	}

	public XComponent getComponent(String name) {
		for (XComponent xc : getComponents()) {
			if (xc.getName().equals(name))
				return xc;
		}
		return null;
	}

	public XComponent[] getComponents() {
		return components;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public XComponent getParent() {
		return parent;
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

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	private void setParent(XComponent component) {
		this.parent = component;
	}

}
