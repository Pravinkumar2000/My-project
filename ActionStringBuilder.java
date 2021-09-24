package com.actionstring;

public class ActionStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder brstr=new StringBuilder("Hello");
		brstr.append(" World");
		System.out.println(brstr);
		brstr.insert(5,"_Java");
		System.out.println(brstr);
		brstr.replace(5,6," ");
		System.out.println(brstr);
	}

}
