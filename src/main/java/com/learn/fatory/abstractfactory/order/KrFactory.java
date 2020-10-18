package com.learn.fatory.abstractfactory.order;

import com.learn.fatory.abstractfactory.food.Food;
import com.learn.fatory.abstractfactory.food.FriedChicken;
import com.learn.fatory.abstractfactory.food.KimChi;

public class KrFactory implements AbsFactory {

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
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("辣的韩式炸鸡");
		} else if (foodName.equals("KimChi")) {
			food = new KimChi();
			food.setName("辣的韩国泡菜");
		}
		return food;
	}

	@Override
	public Food createCommonFood(String foodName) {
		// TODO Auto-generated method stub
		Food food = null;
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("原味的韩式炸鸡");
		} else if (foodName.equals("KimChi")) {
			food = new KimChi();
			food.setName("原味的韩国泡菜");
		}
		return food;
	}
}
