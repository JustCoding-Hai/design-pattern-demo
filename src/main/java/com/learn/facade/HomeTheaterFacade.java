package com.learn.facade;

/**
 * 家庭影院系统的外观类
 * 
 * @author LENOVO
 *
 */
public class HomeTheaterFacade {

	// 各个子系统的对象
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private Screen screen;

	// 构造器，给子系统对象赋值相应的实例
	public HomeTheaterFacade() {
		this.amplifier = Amplifier.getInstance();
		this.dvdPlayer = DvdPlayer.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
	}

	// 打开电影
	public void watchMovie(String movie) {
		screen.down();
		projector.on();
		amplifier.on();
		amplifier.setInput("DVD");
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	// 关闭电影
	public void endMovie(String movie) {
		dvdPlayer.pause(movie);
		dvdPlayer.off();
		amplifier.off();
		projector.off();
		screen.up();

	}

}
