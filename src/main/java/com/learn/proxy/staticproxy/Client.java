package com.learn.proxy.staticproxy;

public class Client {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		TeacherProxy teacherProxy = new TeacherProxy(teacher);
		teacherProxy.teach();
	}

}
