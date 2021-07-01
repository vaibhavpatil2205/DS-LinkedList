package com.ds;

public class Main {
	public static void main(String[] args) {
		Linkedlist linkedlist=new Linkedlist();
	
	    Linkedlist.Node prevNode = linkedlist.insert(56);
		linkedlist.insertAfter(prevNode, 30); 
		linkedlist.print();	
		}
}