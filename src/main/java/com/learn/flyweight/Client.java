package com.learn.flyweight;

public class Client {
	public static void main(String[] args) {
		WebsiteFactory factory = new WebsiteFactory();
		Website website01 = factory.getWebsite("��վ");
		website01.use(new User("Tom"));
		Website website02 = factory.getWebsite("��վ");
		website02.use(new User("Jimmy"));
		System.out.println(factory.getWebsitCount());
	}

}
