package com.learn.fatory.factorymethod.order;

import com.learn.fatory.factorymethod.food.Food;
import com.learn.fatory.factorymethod.food.HotDryNoodles;
import com.learn.fatory.factorymethod.food.PekingDuck;

/*
 * �����й�ʳ��Ķ���
 * ��������ģʽ����createFood()�������𴴽��й�ʳ��Ķ���
 */
public class ChineseFoodOrder extends FoodOrder {
	@Override
	public Food createFood(String foodName) {
		// TODO Auto-generated method stub
		Food food = null;
		System.out.println("--��������ģʽ--");
		if (foodName.equals("HotDryNoodles")) {
			food = new HotDryNoodles();
			food.setName("�人�ȸ���");
		} else if (foodName.equals("PekingDuck")) {
			food = new PekingDuck();
			food.setName("������Ѽ");
		}

		return food;
	}

}
