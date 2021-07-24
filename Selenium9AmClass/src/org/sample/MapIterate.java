package org.sample;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class MapIterate {


public static void main(String[] args) {
 Map<Integer, String> mi = new TreeMap<Integer, String>();
 mi.put(10, "HDFC");
 mi.put(50, "AXIS");
 mi.put(30, "LICHF");	
	
	Set<Entry<Integer, String>> entrySet = mi.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry.getValue());
	}
	
	
	
	
}
}
