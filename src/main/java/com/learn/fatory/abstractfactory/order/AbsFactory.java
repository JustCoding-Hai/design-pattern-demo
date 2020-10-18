package com.learn.fatory.abstractfactory.order;

import com.learn.fatory.abstractfactory.food.Food;

//���󹤳�ģʽ�ĳ���㣨�ӿڣ�
public interface AbsFactory {

	public Food createFood(String foodName, String flavor);// ����flavor��ζ���ò�ͬ�ķ�����������

	public Food createSpicyFood(String foodName);// ��������ʳ��

	public Food createCommonFood(String foodName);// ������ͨ��ʳ��
}
