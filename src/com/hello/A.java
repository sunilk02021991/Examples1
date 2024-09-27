package com.hello;

public class A 
{
	public static void main(String[] args)
	{
		int num =9;
		
		if(num%3==0)
		{
			System.out.println("fizz");
		}
		else if(num%5==0)
		{
			System.out.println("Buzz");
		}
		else if(num%3==0 || num%5==0)
		{
			System.out.println("fizz & Buzz");
		}
		
		else 
		{
			System.out.println("number not divisible by 3 & 5");
		}
		
	}
}
