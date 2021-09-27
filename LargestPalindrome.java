package com.projeuler;

import java.util.Scanner;

public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
 * A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
 *  
 * 
 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number b/w 10100 - 998001:");
		int num=scan.nextInt();
		if((num<10100)||(num>998001))
		{
			System.out.println("Wrong input!!!");
		}
		int temp1=0,temp2=0;
		for(int i=100;i<=999;i++)
		{
			for(int j=101;j<=999;j++)
			{
				if(i*j==num)
				{
					temp1=i;
					temp2=j;
				}
			}
		}
		System.out.println(temp1);
		System.out.println(temp2);

	}

}
