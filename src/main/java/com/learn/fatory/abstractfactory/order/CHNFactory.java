package com.learn.fatory.abstractfactory.order;

import com.learn.fatory.abstractfactory.food.Food;
import com.learn.fatory.abstractfactory.food.HotDryNoodles;
import com.learn.fatory.abstractfactory.food.PekingDuck;

public class CHNFactory implements AbsFactory {

	@Override
	public Food createFood(String foodName, String flavor) {
		System.out.println("--抽象工厂模式--");
		Food food = null;
		if ("spicy".equals(flavor)) {
			food = createSpicyFood(foodName);
		} else if ("common".equals(flavor)) {
			food = createCommonFood(foodName);
		}
		return food;
	}

	@Override
	public Food createSpicyFood(String foodName) {
		Food food = null;
		if (foodName.equals("HotDryNoodles")) {
			food = new HotDryNoodles();
			food.setName("辣的武汉热干面");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("辣的北京烤鸭");
		}
		return food;
	}

	@Override
	public Food createCommonFood(String foodName) {
		Food food = null;
		if (foodName.equals("HotDryNoodles")) {
			food = new HotDryNoodles();
			food.setName("原味的武汉热干面");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("原味的北京烤鸭");
		}
		return food;
	}

}
