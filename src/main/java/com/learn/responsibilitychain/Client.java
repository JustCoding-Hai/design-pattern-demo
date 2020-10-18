package com.learn.responsibilitychain;

public class Client {
	public static void main(String[] args) {
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, "�̲�", 15000);

		DepartmentApprover departmentApprover = new DepartmentApprover("������");
		CollegeApprover collegeApprover = new CollegeApprover("��Ժ��");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("����У��");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("��У��");

		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);

		departmentApprover.processRequest(purchaseRequest);

	}

}
