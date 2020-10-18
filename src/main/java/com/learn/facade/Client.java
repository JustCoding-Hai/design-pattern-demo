package com.learn.facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.watchMovie("肖申克的救赎");
		homeTheaterFacade.endMovie("肖申克的救赎");
	}

}
