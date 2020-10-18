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
//		// ���������������������������п�¡
//		deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
//
//		return deep;
//	}

	public DeepProtoType deepClone() {
		// ����������
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			// ���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			// �����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
			return deepProtoType;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			// �ر���
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
