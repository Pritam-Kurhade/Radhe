package com.arrays;

import java.util.LinkedList;

public class LinkedListDemo2 {
public static void main(String[] args) {
	
	LinkedList<Integer> ll2= new LinkedList<Integer>();
	ll2.add(34);
	ll2.add(45);
	ll2.add(55);
	
	for (Integer i:ll2) {
		System.out.println(i);
	}
	//System.out.println(ll2);
}
}
