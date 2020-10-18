package com.learn.fatory.abstractfactory.order;

import com.learn.fatory.abstractfactory.food.Food;

//抽象工厂模式的抽象层（接口）
public interface AbsFactory {

	public Food createFood(String foodName, String flavor);// 根据flavor口味调用不同的方法创建对象

	public Food createSpicyFood(String foodName);// 创建辣的食物

	public Food createCommonFood(String foodName);// 创建普通的食物
}
