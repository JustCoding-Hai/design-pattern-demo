package com.learn.fatory.abstractfactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.learn.fatory.abstractfactory.food.Food;

public class FoodOrder {

	// 获取请求，制作食品
	public void acceptOrder(AbsFactory absFactory) {
		Food food;// 食品对象
		String foodName = "";// 用户输入的类型
		String flavor = "";// 用户输入的口味
		do {
			flavor = getFlavor();
			foodName = getFoodName();
			food = absFactory.createFood(foodName, flavor);
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

	/*
	 * 获取用户口味
	 */
	private String getFlavor() {
		System.out.println("输入你的口味偏好：(spicy or common)");
		Scanner scanner = new Scanner(System.in);
		String flavor = scanner.nextLine();
		return flavor;

	}

}
