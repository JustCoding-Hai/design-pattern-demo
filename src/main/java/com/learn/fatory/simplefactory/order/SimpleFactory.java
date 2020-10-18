package com.learn.fatory.simplefactory.order;

import com.learn.fatory.simplefactory.food.Food;
import com.learn.fatory.simplefactory.food.FriedChicken;
import com.learn.fatory.simplefactory.food.PekingDuck;

/*
 * �򵥹�����
 */
public class SimpleFactory {

	// �������ʹ�����ͬ��ʳƷ������ʳƷ����
	public Food createFood(String foodName) {
		Food food = null;
		System.out.println("--�򵥹���ģʽ--");
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("ը��");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("������Ѽ");
		}

		return food;

	}

}
