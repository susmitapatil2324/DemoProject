package com.java.collection.example;

import java.util.HashSet;

public class Example_1 {

	public static void main(String[] args) {
      //Creating HashSet Object
		HashSet hs = new HashSet();
		hs.add("Ram");
		hs.add("Shital");
		hs.add("Shyam");
		hs.add("Sushmita");
		
		hs.forEach(a-> System.out.println(a));
		
	}

}
