package com.learn.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cloneName;

	public DeepCloneableTarget(String cloneName) {
		super();
		this.cloneName = cloneName;
	}

//	// 该类的属性只有String，因为String的不可变性（可以使用反射来修改String的值），这里使用Object类的clone即可
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
}
