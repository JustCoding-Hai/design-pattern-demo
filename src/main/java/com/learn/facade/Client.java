package com.learn.facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.watchMovie("Ф��˵ľ���");
		homeTheaterFacade.endMovie("Ф��˵ľ���");
	}

}
