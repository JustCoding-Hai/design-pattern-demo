package com.learn.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
	// ���ϣ��䵱�ص�����
	private HashMap<String, Website> pool = new HashMap<String, Website>();

	// ������վ���ͷ�����վʵ�������pool�в������򴴽�����������
	public Website getWebsite(String type) {
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebsite(type));
		}
		return pool.get(type);
	}

	// ����pool�еĴ��ڵ�Websiteʵ������
	public Integer getWebsitCount() {
		return pool.size();
	}

}
