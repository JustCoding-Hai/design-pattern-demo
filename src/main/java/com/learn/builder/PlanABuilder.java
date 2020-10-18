package com.learn.builder;

public class PlanABuilder extends AbstractBuilder {

	@Override
	public void arrangeMorning() {
		// TODO Auto-generated method stub
		plan.setMorningPlan("出发时间：8:00,目的地：白云山");
		System.out.println("已制定好早上的计划");
	}

	@Override
	public void arrangeAfternoon() {
		// TODO Auto-generated method stub
		plan.setAfternoonPlan("出发时间：12：00，目的地：长隆欢乐世界");
		System.out.println("已制定好下午的计划");
	}

	@Override
	public void arrangeNight() {
		// TODO Auto-generated method stub
		plan.setNightPlan("出发时间： 20：00 ，目的地：广州塔");
		System.out.println("已制定好晚上的计划");
	}

	@Override
	public void arrangeSleep() {
		System.out.println("该计划不安排住宿");
	}

}
