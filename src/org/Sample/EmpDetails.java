package org.Sample;

public class EmpDetails {
	int a=100;
	int b=50;

private void add() {
	System.out.println(" CodeA Added");
}
private void adition() {
	System.out.println("Code C added");
}
private void print() {
	System.out.println("Code C Added");
}
public static void main(String[]args) {
	EmpDetails d=new EmpDetails();
	d.add();
	d.adition();
	d.print();
}
}
