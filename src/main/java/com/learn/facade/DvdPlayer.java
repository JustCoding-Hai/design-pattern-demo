package com.learn.facade;

/**
 * DVD播放器
 * 
 * @author LENOVO
 *
 */
public class DvdPlayer {

	private static DvdPlayer dvdPlayer = new DvdPlayer();

	public static DvdPlayer getInstance() {
		return dvdPlayer;
	}

	public void on() {
		System.out.println("打开DVD播放器");
	}

	public void off() {
		System.out.println("关闭DVD播放器");
	}

	public void play(String filmName) {
		System.out.println("开始播放电影：【" + filmName + "】");
	}

	public void pause(String filmName) {
		System.out.println("停止播放电影：【" + filmName + "】");
	}
}
