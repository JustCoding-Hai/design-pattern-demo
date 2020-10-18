package com.learn.fatory.factorymethod.order;

import com.learn.fatory.factorymethod.food.Food;
import com.learn.fatory.factorymethod.food.FriedChicken;
import com.learn.fatory.factorymethod.food.KimChi;

/*
 * 处理外国食物的订购
 * 工厂方法模式——createFood()方法负责创建韩国食物的对象
 */
public class KrFoodOrder extends FoodOrder {

	@Override
	public Food createFood(String foodName) {
		// TODO Auto-generated method stub
		Food food = null;
		System.out.println("--工厂方法模式--");
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("韩式炸鸡");
		} else if (foodName.equals("KimChi")) {
			food = new KimChi();
			food.setName("韩国泡菜");
		}

		return food;
	}

}
