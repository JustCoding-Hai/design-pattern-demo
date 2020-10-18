package com.learn.decorator;

//�ͻ��ࡪ�����ȹ�
public class CoffeeBar {
	public static void main(String[] args) {
		Drink order = new LongBlack();
		System.out.println("����" + order.getDescription() + ": " + order.getPrice());
		System.out.println("�ܼ۸�" + order.cost());

		order = new Milk(order);// ����ţ��
		System.out.println("����" + order.getDescription());
		System.out.println("�ܼ۸�" + order.cost());

		order = new Milk(order);// ����ţ��
		System.out.println("����" + order.getDescription());
		System.out.println("�ܼ۸�" + order.cost());

		order = new Chocolate(order);// �����ɿ���
		System.out.println("����" + order.getDescription());
		System.out.println("�ܼ۸�" + order.cost());
	}

}
