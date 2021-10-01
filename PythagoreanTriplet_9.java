package com.projeuler;

public class PythagoreanTriplet_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 *							a^2 + b^2 = c^2
 *				For example, 5^2 + 12^2 = 9 + 16 = 25 = 5^2.
 *
 *	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *			Find the product abc.
 * 
 * 
 */
		
		int k=0,sum=12;
		
		for(int i=1;i<=sum;i++)
		{
			for(int j=i;j<=sum;j++)
			{
				k=sum-i-j;
					
				if(i*i+j*j==k*k)
				{
					System.out.printf("%d %d %d",i,j,k);
							
				}	
				
			}
			
		}

	}

}
