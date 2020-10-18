package com.learn.proxy.staticproxy;

public class TeacherProxy implements ITeacher {

	private Teacher teacher;

	public TeacherProxy(Teacher teacher) {
		// TODO Auto-generated constructor stub
		this.teacher = teacher;
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("����ǰ");
		teacher.teach();
		System.out.println("�����");
	}

}
