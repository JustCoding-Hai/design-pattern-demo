package com.learn.fatory.factorymethod.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.learn.fatory.factorymethod.food.Food;

public abstract class FoodOrder {

	/*
	 * ��ȡ��������ʳƷ
	 */
	public void acceptOrder() {
		// ʳƷ����
		Food food;
		String foodName = "";// �û����������
		do {
			foodName = getFoodName();
			food = createFood(foodName);
			if (food != null) {
				food.prepare();
				food.make();
				food.box();
			} else {
				System.out.println("�����ʳƷ�޹�Ӧ");
			}
		} while (true);
	}

	/*
	 * ʵ��������������Ƶ���������У��˷������������Ĵ�����������������Ϊ��װ�������С�
	 */
	public abstract Food createFood(String foodName);

	private String getFoodName() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String foodName = null;
		System.out.println("����Ҫ������ʳƷ��������");
		try {
			foodName = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("��������");
			e.printStackTrace();
		}
		return foodName;
	}

}
