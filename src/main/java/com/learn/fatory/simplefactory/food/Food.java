package com.learn.fatory.simplefactory.food;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
