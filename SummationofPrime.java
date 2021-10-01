package com.projeuler;

public class SummationofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

		Find the sum of all the primes below two million.
 *  
 * 
 */
		
		int ct=0,i=2,j=1,sum=0;  
		while(i<10)  
		{  
			j=1;  
			ct=0;  
			while(j<=i)  
			{  
				if(i%j==0)  
					ct++;  
					j++;   
			}  
			if(ct==2)  
			{   
				sum+=i;
			}  
			i++;  
		}
		System.out.printf("%d ",sum);

	}

}
