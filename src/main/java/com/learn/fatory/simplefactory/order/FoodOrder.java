package com.learn.fatory.simplefactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.learn.fatory.simplefactory.food.Food;

public class FoodOrder {
	private SimpleFactory simpleFactory;// �򵥹�������SimpleFactory������

	// ��ȡ��������ʳƷ
	public void acceptOrder(SimpleFactory simpleFactory) {
		Food food;// ʳƷ����
		String foodName = "";// �û����������
		this.simpleFactory = simpleFactory;
		do {
			foodName = getFoodName();
			food = simpleFactory.createFood(foodName);
			if (food != null) {
				food.prepare();
				food.make();
				food.box();
			} else {
				System.out.println("�����ʳƷ�޹�Ӧ");
			}
		} while (true);
	}

	private String getFoodName() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String foodName = null;
		System.out.println("����Ҫ������ʳƷ��������");
		try {
			foodName = bufferedReader.readLine();
		} catch (IOException e) {
			System.out.println("��������");
			e.printStackTrace();
		}
		return foodName;
	}

}
