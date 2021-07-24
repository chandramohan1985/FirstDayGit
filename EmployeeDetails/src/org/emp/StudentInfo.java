package org.emp;

public class StudentInfo {
	private void name(String name ) {
		// TODO Auto-generated method stub
		System.out.println("Student name is" + name);
	}
public static void main(String[] args) {
	StudentInfo s = new StudentInfo();
	s.name("Thvya");
	
	int English = 42 ; int Maths = 38 ; int Social = 76;
	if(English>Maths && English>Social) {
		System.out.println("English mark is topper");
	}
	else if(Maths>Social && Maths>English) {
		System.out.println("Maths mark is topper");
	}
	else if(Social>English && Social>Maths) {
		System.out.println("Social mark is topper");
	}
	
	
	
}
}
