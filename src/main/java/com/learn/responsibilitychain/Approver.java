package com.learn.responsibilitychain;

//����������
public abstract class Approver {

	Approver approver;// ��һ��������
	String name;// ����

	public Approver(String name) {
		this.name = name;
	}

	/**
	 * @param approver ������һ��������
	 */
	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	// �������������ķ�����������ʵ��
	public abstract void processRequest(PurchaseRequest purchaseRequest);

}
