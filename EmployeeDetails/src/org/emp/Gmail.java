package org.emp;

public class Gmail {
	public static void main(String[] args) {
		String email=new String("Nishakerala24@gmail.com");
	System.out.println(email);
	boolean contains = email.contains("@");
	System.out.println("valid email Id :" + contains);
		
	String name1=new String("Nisha");
		System.out.println(name1);
		
	String name2=new String("nisha");	
		System.out.println(name2);
	
	boolean equalsIgnoreCase = name1.equalsIgnoreCase(name2);	
	System.out.println("Nisha & nisha is equal when ignore case :" + equalsIgnoreCase);
	
	String info = new String ("welcome to java class");
	System.out.println(info);
	
	String replace = info.replace("java", "sql");
	System.out.println(replace);
	
		
	}

}

