package com.learn.decorator;

//客户类——咖啡馆
public class CoffeeBar {
	public static void main(String[] args) {
		Drink order = new LongBlack();
		System.out.println("购买：" + order.getDescription() + ": " + order.getPrice());
		System.out.println("总价格：" + order.cost());

		order = new Milk(order);// 加入牛奶
		System.out.println("购买：" + order.getDescription());
		System.out.println("总价格：" + order.cost());

		order = new Milk(order);// 加入牛奶
		System.out.println("购买：" + order.getDescription());
		System.out.println("总价格：" + order.cost());

		order = new Chocolate(order);// 加入巧克力
		System.out.println("购买：" + order.getDescription());
		System.out.println("总价格：" + order.cost());
	}

}
