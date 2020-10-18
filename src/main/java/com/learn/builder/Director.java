package com.learn.builder;

public class Director {
	AbstractBuilder planBuilder;

	public Director(AbstractBuilder planBuilder) {
		// TODO Auto-generated constructor stub
		this.planBuilder = planBuilder;
	}

	public void setPlanBuilder(AbstractBuilder planBuilder) {
		this.planBuilder = planBuilder;
	}

	public Plan constructPlan() {
		System.out.println("计划制定：");
		planBuilder.arrangeMorning();
		planBuilder.arrangeAfternoon();
		planBuilder.arrangeNight();
		planBuilder.arrangeSleep();
		return planBuilder.getPlan();
	}

}
