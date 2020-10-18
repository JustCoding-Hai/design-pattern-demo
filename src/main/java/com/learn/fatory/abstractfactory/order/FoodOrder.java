package com.learn.fatory.abstractfactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.learn.fatory.abstractfactory.food.Food;

public class FoodOrder {

	// ��ȡ��������ʳƷ
	public void acceptOrder(AbsFactory absFactory) {
		Food food;// ʳƷ����
		String foodName = "";// �û����������
		String flavor = "";// �û�����Ŀ�ζ
		do {
			flavor = getFlavor();
			foodName = getFoodName();
			food = absFactory.createFood(foodName, flavor);
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

	/*
	 * ��ȡ�û���ζ
	 */
	private String getFlavor() {
		System.out.println("������Ŀ�ζƫ�ã�(spicy or common)");
		Scanner scanner = new Scanner(System.in);
		String flavor = scanner.nextLine();
		return flavor;

	}

}
