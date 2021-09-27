package com.projeuler;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
/*
 * The sum of the squares of the first ten natural numbers is,

				1^2+2^2+3^3...10^10=385
		
	The square of the sum of the first ten natural numbers is,

				(1+2+3+...10)^2=55^2=3025
		
	Hence the difference between the sum of the squares of the first ten 
	natural numbers and the square of the sum is .
	
				3025-385=2640
		
	Find the difference between the sum of the squares of the first one 
	hundred natural numbers and the square of the sum
 * 
 */
		
		int sumofsquare=sumofSquare(100);
		System.out.println("Sum of Square : "+sumofsquare);
		int squareofsum=squareofSum(100);
		System.out.println("Square of Sum : "+squareofsum);
		int result=squareofsum-sumofsquare;
		System.out.println("The result is : "+result);
		
	}
	
	public static int sumofSquare(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i*i; 
		}
		return sum;
	}
	public static int squareofSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum*sum;
	}

}
