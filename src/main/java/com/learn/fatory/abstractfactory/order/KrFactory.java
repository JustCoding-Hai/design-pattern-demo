package com.learn.fatory.abstractfactory.order;

import com.learn.fatory.abstractfactory.food.Food;
import com.learn.fatory.abstractfactory.food.FriedChicken;
import com.learn.fatory.abstractfactory.food.KimChi;

public class KrFactory implements AbsFactory {

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
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("���ĺ�ʽը��");
		} else if (foodName.equals("KimChi")) {
			food = new KimChi();
			food.setName("���ĺ����ݲ�");
		}
		return food;
	}

	@Override
	public Food createCommonFood(String foodName) {
		// TODO Auto-generated method stub
		Food food = null;
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("ԭζ�ĺ�ʽը��");
		} else if (foodName.equals("KimChi")) {
			food = new KimChi();
			food.setName("ԭζ�ĺ����ݲ�");
		}
		return food;
	}
}
