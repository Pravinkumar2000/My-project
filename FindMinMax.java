package com.functions;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindMinMax mm = new FindMinMax();
		int res=mm.findMin(5,6);
		int res1=mm.findMax(9,10);
		System.out.println("The minimum value is "+res);
		System.out.println("The maximum value is "+res1);

	}
	public static int findMin(int num1,int num2)
	{
		if(num1<num2)
		{
			return num1;
		}
		else if(num1==num2)
		{
			return 0;
		}
		else
		{
			return num2;
		}
	}
	public static int findMax(int num1,int num2)
	{
		if(num1>num2)
		{
			return num1;
		}
		else if(num1==num2)
		{
			return 0;
		}
		else
		{
			return num2;
		}
	}

}
