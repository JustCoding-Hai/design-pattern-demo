package com.learn.fatory.simplefactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.learn.fatory.simplefactory.food.Food;

public class FoodOrder {
	private SimpleFactory simpleFactory;// 简单工厂对象，SimpleFactory的引用

	// 获取请求，制作食品
	public void acceptOrder(SimpleFactory simpleFactory) {
		Food food;// 食品对象
		String foodName = "";// 用户输入的类型
		this.simpleFactory = simpleFactory;
		do {
			foodName = getFoodName();
			food = simpleFactory.createFood(foodName);
			if (food != null) {
				food.prepare();
				food.make();
				food.box();
			} else {
				System.out.println("输入的食品无供应");
			}
		} while (true);
	}

	private String getFoodName() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String foodName = null;
		System.out.println("输入要订购的食品——》：");
		try {
			foodName = bufferedReader.readLine();
		} catch (IOException e) {
			System.out.println("输入有误！");
			e.printStackTrace();
		}
		return foodName;
	}

}
