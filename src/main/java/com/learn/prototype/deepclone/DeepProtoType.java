package com.learn.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public DeepCloneableTarget deepCloneableTarget;

	public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
		super();
		this.name = name;
		this.deepCloneableTarget = deepCloneableTarget;
	}

//	@Override
//	protected DeepProtoType clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		DeepProtoType deep = (DeepProtoType) super.clone();
//		// 对引用类型做单独处理，单独进行克隆
//		deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
//
//		return deep;
//	}

	public DeepProtoType deepClone() {
		// 创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			// 反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
			return deepProtoType;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			// 关闭流
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();

			}
		}

	}
}
