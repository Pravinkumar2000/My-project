package com.demo;

import java.util.Scanner;

public class LuckyPersonorNot {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
				
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter bill no:");
				
			int billNo=sc.nextInt();
			System.out.println("Enter date:");
			int date=sc.nextInt();
			if(billNo%100==date||billNo%10==date&&billNo%date==0)
			{
				System.out.println("Lucky person");
			}
			else
			{
				System.out.println("Not a Lucky person");
			}		
		}

	

}
