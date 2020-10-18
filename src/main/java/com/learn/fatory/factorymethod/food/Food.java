package com.learn.fatory.factorymethod.food;

/*
 * 抽象的食品基类
 */
public abstract class Food {
	private String name;

	// 准备食品的原材料，每个食品原材料不同，由其子类实现，下同
	public abstract void prepare();

	// 食品制作
	public abstract void make();

	// 打包食品
	public void box() {
		System.out.println(name + "打包完成");
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
