package org.emp;

public class employeeInfo implements Employee{
public void Age (char gender, int age) {
	// TODO Auto-generated method stub
System.out.println("Employee is " + gender  + age);
}
public void Phone() {
	// TODO Auto-generated method stub
System.out.println("Employee phone no is 7738522627");
}	
public void Email() {
	// TODO Auto-generated method stub
System.out.println("Employee email is chandramohanr1985@gmail.com");
}	

	
public static void main(String[] args) {
	employeeInfo i = new employeeInfo();
	i.EmployeeName();
	i.Age ('M' ,  36);
	i.Phone();
	i.Email();
	i.EmployeeeId();	
}
@Override
public void EmployeeName() {
	// TODO Auto-generated method stub
System.out.println("Employee name is chandra");	
}
@Override
public void EmployeeeId() {
	// TODO Auto-generated method stub
	System.out.println("Employee Id is 1234");
}	
	}


