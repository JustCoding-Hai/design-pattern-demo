package com.learn.decorator;

public abstract class Drink {
	public String description;// ����
	private float price = 0.0f;// ��Ʒ�۸�

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

	public abstract float cost();// ������ã����󷽷���������ʵ��

}
