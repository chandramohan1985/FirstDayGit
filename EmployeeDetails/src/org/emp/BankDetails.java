package org.emp;

public class BankDetails {

public void Name() {
	// TODO Auto-generated method stub
System.out.println("Bank name is HDFC");
}
public void Area() {
	// TODO Auto-generated method stub
System.out.println("Bank area is MGR Nagar");
}
public static void main(String[] args) {
	BankDetails B = new BankDetails();
	B.Name();
    B.Area();
    int i=1985;
    System.out.println("year" + i);
    while (i<1987) {
		System.out.println(i);
		i++;
	}
    for (int j = 25; j <29 ; j++) {
		if(j==27) {
			continue;
	}
		System.out.println(j);
}
       int age =36;
       do {
		System.out.println(age);
		break;
	} while (age<37);
       
      
      
}
}
