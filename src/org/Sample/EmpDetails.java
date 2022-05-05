package org.Sample;

public class EmpDetails {
	int a=100;
	int b=50;

private void empId(int id) {
	System.out.println("Emp ID :"+id);
}
private void companyName(String name) {
System.out.println("Company Name :"+name);
}
private void add() {
	System.out.println("Added");
}
private void print() {
	System.out.println("Print Sucessful....");
}
public static void main(String[]args) {
	EmpDetails d=new EmpDetails();
	d.empId(555);
	d.companyName("Acceture");
	d.add();
}
}
