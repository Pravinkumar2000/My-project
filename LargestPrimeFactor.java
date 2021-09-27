package com.projeuler;
import java.util.*;
public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
 * 
 * 
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find largest prime factor:");
		long num=scan.nextLong();
		for(int i=2;i<num;i++)
		{
			while(num%i==0)
			{
				num=num/i;
				
			}
		}
		if(num>2)
		{
			System.out.println("The largest prime factor is : "+num);
		}

	}

}
