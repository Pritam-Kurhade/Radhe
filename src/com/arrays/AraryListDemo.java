package com.arrays;

import java.util.ArrayList;

public class AraryListDemo {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Pritam");
		al.add("Suraj");
		al.stream().forEach(x->System.out.println(x));
	}
}
