package com.projeuler;

public class Square_10001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can 
 * see that the 6th prime is 13.

	What is the 10001st prime number? 
 * 
 */
		
		/*int num=10,count=0,temp=0,count1=0;
		
		
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
				
					count++;
					
				}
				if(count==2)
				{
					//count1++;
					if(i>temp)
					{
						temp=i;
					}
					
					
				}
			}
			
			
		}
		
		
	
		System.out.println(temp);*/
		
		
		int ct=0,n=0,i=1,j=1;  
		while(n<10)  
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
				  
				n++;  
			}  
			i++;  
		}
		System.out.printf("%d ",i-1);
	}

}























