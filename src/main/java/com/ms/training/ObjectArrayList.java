package com.ms.training;

import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Array;

public class ObjectArrayList {

	public static void main(String[] args) {

				
	    Object arOne[]= {111,"manish"};
		Object arTwo[]= {112,"rajesh"};
		Object arThree[]= {113,"shubham"};
		
		ArrayList<Object[]> list=new ArrayList<Object[]>();
		list.add(arOne);
		list.add(arTwo);
		list.add(arThree);
		
		for(Object ar[]:list) {
			for(Object item:ar) {
				System.out.println(item);
			}
			System.out.println("_______________________");
		}
		
	}

}
