package frames8amclass;

import java.util.ArrayList;
import java.util.List;

public class list extends UserDefinedList{
public static void main(String[] args) {
	
	list l = new list();
	l.setUserName(1234);
	l.setPassword("chandra");
	list e = new list();
    e.setUserName1(2345);
	e.setPassword1("Thvya");
	list f = new list();
	f.setUserName2(3456);
	f.setPassword2("Yashvee");
	
List<list> li = new ArrayList<list>();
	li.add(l);
	li.add(e);
	li.add(f);
for (int i = 0; i <li.size(); i++) {
	list z = li.get(i);

	int userName3 = z.getUserName();
System.out.println(userName3);
	String password3 = z.getPassword();
System.out.println(password3);
int userName4 = z.getUserName1();
System.out.println(userName4);
	String password4 = z.getPassword1();
System.out.println(password4);
int userName5 = z.getUserName2();
System.out.println(userName5);
	String password5 = z.getPassword2();
System.out.println(password5);



}
}
}

