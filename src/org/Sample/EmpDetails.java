package org.Sample;

public class EmpDetails {

private void empId(int id) {
	System.out.println("Emp ID :"+id);
}
private void companyName(String name) {
System.out.println("Company Name :"+name);
}
private void adition() {
	System.out.println("Code C added");
}
public static void main(String[]args) {
	EmpDetails d=new EmpDetails();
	d.empId(555);
	d.companyName("Acceture");
	d.adition();
}
}
