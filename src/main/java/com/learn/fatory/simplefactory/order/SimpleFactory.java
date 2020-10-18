package com.learn.fatory.simplefactory.order;

import com.learn.fatory.simplefactory.food.Food;
import com.learn.fatory.simplefactory.food.FriedChicken;
import com.learn.fatory.simplefactory.food.PekingDuck;

/*
 * 简单工厂类
 */
public class SimpleFactory {

	// 根据类型创建不同的食品，返回食品对象
	public Food createFood(String foodName) {
		Food food = null;
		System.out.println("--简单工厂模式--");
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("炸鸡");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("北京烤鸭");
		}

		return food;

	}

}
