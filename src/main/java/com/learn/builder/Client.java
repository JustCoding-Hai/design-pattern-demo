package com.learn.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director(new PlanABuilder());
		Plan p1 = director.constructPlan();
		System.out.println("计划详情:" + p1);
		director.setPlanBuilder(new PlanBBuilder());
		Plan p2 = director.constructPlan();
		System.out.println("计划详情:" + p2);
	}

}
