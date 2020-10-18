package com.learn.prototype;

public class Client {
	public static void main(String[] args) {
		Sheep sheep = new Sheep("li", "white", 40);
		sheep.friend = new Sheep("kai", "black", 45);
		System.out.println(sheep.toString() + sheep.friend.toString());
		Sheep copySheep = sheep.clone();
		System.out.println("复制的羊：" + copySheep.toString() + copySheep.friend.toString());
		copySheep.friend.size = 8;// 更改克隆羊的朋友的属性
		copySheep.color = copySheep.color + "12";
		System.out.println(sheep.toString() + sheep.friend.toString());
		System.out.println("复制的羊：" + copySheep.toString() + copySheep.friend.toString());
	}
}
