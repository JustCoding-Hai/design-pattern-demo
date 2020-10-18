package com.learn.builder;

public abstract class AbstractBuilder {
	Plan plan = new Plan();

	public abstract void arrangeMorning();

	public abstract void arrangeAfternoon();

	public abstract void arrangeNight();

	public abstract void arrangeSleep();

	public Plan getPlan() {
		return plan;
	}

}
