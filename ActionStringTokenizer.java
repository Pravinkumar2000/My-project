package com.actionstring;

import java.util.StringTokenizer;

public class ActionStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer strtk=new StringTokenizer("Hello Java World");
		while(strtk.hasMoreElements())
		{
			System.out.println(strtk.nextToken(" "));
		}

	}

}
