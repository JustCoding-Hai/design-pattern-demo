package com.learn.fatory.factorymethod.order;

import com.learn.fatory.factorymethod.food.Food;
import com.learn.fatory.factorymethod.food.FriedChicken;
import com.learn.fatory.factorymethod.food.KimChi;

/*
 * �������ʳ��Ķ���
 * ��������ģʽ����createFood()�������𴴽�����ʳ��Ķ���
 */
public class KrFoodOrder extends FoodOrder {

	@Override
	public Food createFood(String foodName) {
		// TODO Auto-generated method stub
		Food food = null;
		System.out.println("--��������ģʽ--");
		if (foodName.equals("FriedChicken")) {
			food = new FriedChicken();
			food.setName("��ʽը��");
		} else if (foodName.equals("KimChi")) {
			food = new KimChi();
			food.setName("�����ݲ�");
		}

		return food;
	}

}
