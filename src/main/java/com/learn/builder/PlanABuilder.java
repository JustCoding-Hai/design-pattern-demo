package com.learn.builder;

public class PlanABuilder extends AbstractBuilder {

	@Override
	public void arrangeMorning() {
		// TODO Auto-generated method stub
		plan.setMorningPlan("����ʱ�䣺8:00,Ŀ�ĵأ�����ɽ");
		System.out.println("���ƶ������ϵļƻ�");
	}

	@Override
	public void arrangeAfternoon() {
		// TODO Auto-generated method stub
		plan.setAfternoonPlan("����ʱ�䣺12��00��Ŀ�ĵأ���¡��������");
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
		System.out.println("�üƻ�������ס��");
	}

}
