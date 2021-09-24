package com.array;

import java.util.Scanner;

public class SumofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
	
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element "+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
			
		}
		System.out.println(sum);
		
	}

}
