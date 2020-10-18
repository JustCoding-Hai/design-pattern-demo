package com.learn.responsibilitychain;

public class DepartmentApprover extends Approver {
	public DepartmentApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if (purchaseRequest.getPrice() < 5000) {
			System.out.println("请求编号" + purchaseRequest.getId() + "被" + this.name + "处理了");
		} else {
			approver.processRequest(purchaseRequest);
		}

	}

}
