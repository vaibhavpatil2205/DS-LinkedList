package com.ds;

public class Main {
	public static void main(String[] args) {
		Linkedlist linkedlist=new Linkedlist();
		linkedlist.insert(56);
		linkedlist.insert(30);
		linkedlist.insert(70);
		linkedlist.print();

		int pop = linkedlist.pop();
		 System.out.println(pop);
		
		linkedlist.print();	
		}
}