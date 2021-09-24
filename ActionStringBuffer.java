package com.actionstring;
import java.util.*;
public class ActionStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer brstr=new StringBuffer("Hello");
		brstr.append(" World");
		System.out.println(brstr);
		brstr.insert(5,"_Java");
		System.out.println(brstr);
		brstr.replace(5,6," ");
		System.out.println(brstr);
		System.out.println(brstr.charAt(6));
		brstr.delete(2,3);
		System.out.println(brstr);
		System.out.println(brstr.capacity());
		System.out.println(brstr.reverse());
		
	}

}
