package org.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.print.attribute.IntegerSyntax;

public interface list{ 
public static void main(String[] args) {
List<Integer> cm= new ArrayList<Integer>();
	cm.add(25);
	cm.add(30);
	cm.add(45);
	cm.add(73);
	System.out.println(cm);
	 

for (Integer rogan : cm){
	System.out.println("Marks:" + rogan);
}

}
}