package com.java.collection.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example_2 {

	public static void main(String[] args) {
	
	HashMap hs = new HashMap();
	hs.put("TCS", 30);
	hs.put("HCL", 20);
	hs.put("Wipro", 50);
	hs.put("IBM", 40);
	
	Set set= hs.keySet();
	
	Iterator itr = set.iterator();
	
	while(itr.hasNext())
	{
		Object key = itr.next();
		System.out.println("Key is : " +key);
		System.out.println("Value is : "+hs.get(key));
	}
	
		
	}

}
