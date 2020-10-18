package com.learn.facade;

/**
 * ��ͥӰԺϵͳ�������
 * 
 * @author LENOVO
 *
 */
public class HomeTheaterFacade {

	// ������ϵͳ�Ķ���
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private Screen screen;

	// ������������ϵͳ����ֵ��Ӧ��ʵ��
	public HomeTheaterFacade() {
		this.amplifier = Amplifier.getInstance();
		this.dvdPlayer = DvdPlayer.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
	}

	// �򿪵�Ӱ
	public void watchMovie(String movie) {
		screen.down();
		projector.on();
		amplifier.on();
		amplifier.setInput("DVD");
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	// �رյ�Ӱ
	public void endMovie(String movie) {
		dvdPlayer.pause(movie);
		dvdPlayer.off();
		amplifier.off();
		projector.off();
		screen.up();

	}

}
