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
		int max=0;
		for(int i=10;i<=99;i++)
		{
			
			for(int j=10;j<=99;j++)
			{
				if((i*j>max)&&(i*j==reverse(i*j)))
				{
					max=i*j;	
				}
			}
		}
		System.out.println(max);
		
	}
	public static int reverse(int n)
	{
		int rem=0,rev=0;
		while(n>1)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		return rev;
	}
	

}
