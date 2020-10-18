package com.learn.responsibilitychain;

//抽象审批者
public abstract class Approver {

	Approver approver;// 下一个审批者
	String name;// 名字

	public Approver(String name) {
		this.name = name;
	}

	/**
	 * @param approver 设置下一个审批者
	 */
	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	// 处理请求审批的方法，由子类实现
	public abstract void processRequest(PurchaseRequest purchaseRequest);

}
