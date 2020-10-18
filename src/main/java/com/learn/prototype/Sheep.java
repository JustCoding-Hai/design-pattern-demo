package com.learn.prototype;

public class Sheep implements Cloneable {
	private String name;
	public String color;
	public int size;
	public Sheep friend;

	public Sheep(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	@Override
	protected Sheep clone() {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sheep;
	}

}
