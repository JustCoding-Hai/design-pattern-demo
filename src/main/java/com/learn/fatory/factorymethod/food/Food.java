package com.learn.fatory.factorymethod.food;

/*
 * �����ʳƷ����
 */
public abstract class Food {
	private String name;

	// ׼��ʳƷ��ԭ���ϣ�ÿ��ʳƷԭ���ϲ�ͬ����������ʵ�֣���ͬ
	public abstract void prepare();

	// ʳƷ����
	public abstract void make();

	// ���ʳƷ
	public void box() {
		System.out.println(name + "������");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
