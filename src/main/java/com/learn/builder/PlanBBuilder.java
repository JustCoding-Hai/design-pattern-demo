package com.learn.builder;

public class PlanBBuilder extends AbstractBuilder {

	@Override
	public void arrangeMorning() {
		// TODO Auto-generated method stub
		plan.setMorningPlan("����ʱ�䣺8:15,Ŀ�ĵأ����ɽ");
		System.out.println("���ƶ������ϵļƻ�");
	}

	@Override
	public void arrangeAfternoon() {
		// TODO Auto-generated method stub
		plan.setAfternoonPlan("����ʱ�䣺11��30��Ŀ�ĵأ���¡��������");
		System.out.println("���ƶ�������ļƻ�");
	}

	@Override
	public void arrangeNight() {
		// TODO Auto-generated method stub
		plan.setNightPlan("����ʱ�䣺 20��00 ��Ŀ�ĵأ�������");
		System.out.println("���ƶ������ϵļƻ�");
	}

	@Override
	public void arrangeSleep() {
		System.out.println("����ס���ڰ�������");
	}

}
