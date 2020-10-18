package com.learn.fatory.abstractfactory.order;

import com.learn.fatory.abstractfactory.food.Food;
import com.learn.fatory.abstractfactory.food.HotDryNoodles;
import com.learn.fatory.abstractfactory.food.PekingDuck;

public class CHNFactory implements AbsFactory {

	@Override
	public Food createFood(String foodName, String flavor) {
		System.out.println("--���󹤳�ģʽ--");
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
			food.setName("�����人�ȸ���");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("���ı�����Ѽ");
		}
		return food;
	}

	@Override
	public Food createCommonFood(String foodName) {
		Food food = null;
		if (foodName.equals("HotDryNoodles")) {
			food = new HotDryNoodles();
			food.setName("ԭζ���人�ȸ���");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("ԭζ�ı�����Ѽ");
		}
		return food;
	}

}
