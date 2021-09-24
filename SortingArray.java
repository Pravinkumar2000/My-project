package com.array;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,98,2,8,56,87};
		System.out.println("Before sorting:");
		show(arr);
		sort(arr);
		System.out.println("After sorting:");
		show(arr);
	}
	public static void show(int arr[])
	{
		int i;
		for(i=0;i<arr.length;i++)
		
			System.out.println(arr[i]+" ");
		
	}
	public static void sort(int arr[])
	{
		int i,j,temp;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
