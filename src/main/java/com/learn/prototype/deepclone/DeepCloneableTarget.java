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

//	// ���������ֻ��String����ΪString�Ĳ��ɱ��ԣ�����ʹ�÷������޸�String��ֵ��������ʹ��Object���clone����
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
}
