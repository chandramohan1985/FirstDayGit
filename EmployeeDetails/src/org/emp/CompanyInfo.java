package org.emp;

public class CompanyInfo {
public void companyName() {
	// TODO Auto-generated method stub
	String name = "IPS-Mehtalia";
System.out.println("Company name is" + name);
}
public void companyAddress() {
	// TODO Auto-generated method stub
	String address = "chennai";
System.out.println("Company address is" + address );
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyAddress();
			
}
}
