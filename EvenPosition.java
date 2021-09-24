package com.array;

import java.util.Scanner;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int num=sc.nextInt();
		System.out.println("Enter the elemets:");
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i=i+2)
		{
			System.out.println("Odd position: "+arr[i]+" ");
		}
		for(int i=1;i<num;i=i+2)
		{
			System.out.println("Even position: "+arr[i]+" ");
		}
		

	}
	
	

}
