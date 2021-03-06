package com.projeuler;

public class SumofEvenValuedTemsFibo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
/*
 *  Each new term in the Fibonacci sequence is generated by adding the
    previous two terms. By starting with 1 and 2, the first 10 terms will be:

					1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

	By considering the terms in the Fibonacci sequence whose values do not 
	exceed four million, find the sum of the even-valued terms.
 * 
 */
		int num1=0,num2=1,num3,sum=0,limit=10;
		int[] arr=new int[limit];
		
		for(int i=2;i<limit;i++)
		{
			num3=num1+num2;
			arr[i]=num3;
			num1=num2;
			num2=num3;
			//System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Sum of even valued terms in fibo series with max limit of "+limit+" is "+sum);
		

	}

}
