package com.learn.fatory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.learn.fatory.factorymethod.food.Food;

public abstract class FoodOrder {

	/*
	 * 获取请求，制作食品
	 */
	public void acceptOrder() {
		// 食品对象
		Food food;
		String foodName = "";// 用户输入的类型
		do {
			foodName = getFoodName();
			food = createFood(foodName);
			if (food != null) {
				food.prepare();
				food.make();
				food.box();
			} else {
				System.out.println("输入的食品无供应");
			}
		} while (true);
	}

	/*
	 * 实例化对象的责任移到这个方法中，此方法负责处理对象的创建，并把这样的行为封装到子类中。
	 */
	public abstract Food createFood(String foodName);

	private String getFoodName() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String foodName = null;
		System.out.println("输入要订购的食品——》：");
		try {
			foodName = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("输入有误！");
			e.printStackTrace();
		}
		return foodName;
	}

}
