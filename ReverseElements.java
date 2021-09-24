package com.array;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int num=sc.nextInt();
		System.out.println("Enter the elemets");
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before reversing:");
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("After reversing:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
