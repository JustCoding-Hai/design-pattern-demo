package com.learn.fatory.factorymethod.order;

import com.learn.fatory.factorymethod.food.Food;
import com.learn.fatory.factorymethod.food.HotDryNoodles;
import com.learn.fatory.factorymethod.food.PekingDuck;

/*
 * 处理中国食物的订购
 * 工厂方法模式——createFood()方法负责创建中国食物的对象
 */
public class ChineseFoodOrder extends FoodOrder {
	@Override
	public Food createFood(String foodName) {
		// TODO Auto-generated method stub
		Food food = null;
		System.out.println("--工厂方法模式--");
		if (foodName.equals("HotDryNoodles")) {
			food = new HotDryNoodles();
			food.setName("武汉热干面");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("北京烤鸭");
		}

		return food;
	}

}
