package com.demo;

import java.util.Scanner;

public class DiscountOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st product price");
		int prod1=sc.nextInt();
		System.out.println("Enter 1st product price");
		int prod2=sc.nextInt();
		System.out.println("Enter 1st product price");
		int prod3=sc.nextInt();
		int least;
		int total=prod1+prod2+prod3;
		if((prod1<prod2)&&(prod1<prod3))
		{
			least=prod1;
		}
		else if((prod2<prod1)&&(prod2<prod3))
		{
			least=prod2;
		}
		else
		{
			least=prod3;
		}
		
		double offer1=(double)total*0.2;
		double offer1f=total-offer1;
		int offer2=total-least;
	
		
		if(offer1f<offer2)
		{
			System.out.println("Go for offer1");
		}
		else {
			System.out.println("Go for offer2");
		}
	}

}
