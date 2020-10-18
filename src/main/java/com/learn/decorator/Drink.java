package com.learn.decorator;

public abstract class Drink {
	public String description;// 描述
	private float price = 0.0f;// 单品价格

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	public abstract float cost();// 计算费用，抽象方法由子类来实现

}
