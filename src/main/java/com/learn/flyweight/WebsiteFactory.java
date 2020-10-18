package com.learn.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
	// 集合，充当池的作用
	private HashMap<String, Website> pool = new HashMap<String, Website>();

	// 根据网站类型返回网站实例，如果pool中不存在则创建并放入其中
	public Website getWebsite(String type) {
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebsite(type));
		}
		return pool.get(type);
	}

	// 返回pool中的存在的Website实例数量
	public Integer getWebsitCount() {
		return pool.size();
	}

}
