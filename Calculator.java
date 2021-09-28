package classesandmethod;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first no:");
		int x=sc.nextInt();
		
		System.out.print("Enter your second no:");
		int y=sc.nextInt();
		
		System.out.print("Which operation you want to do : ");
		char z=sc.next(".").charAt(0);
		
		if(z=='+')
		{
			int sum=addition(x,y);
			System.out.println("Addition of no is :"+sum);
		}
		else if(z=='*') {
			int multiply=multiply(x,y);
			System.out.println("multiply of no is :"+multiply);
		}
		else if(z=='-') {
			int minus=minus(x,y);
			System.out.println("minus of no is :"+minus);
		}
		else if(z=='/') {
			
			divide(x,y);
		}
		

	}
	
	public static int addition(int x,int y)
	{
		return x+y;
		
	}
	public static int multiply(int x,int y)
	{
		return x*y;
	}
	public static int minus(int x,int y)
	{
		if(x>y)
		{
			return x-y;
		}
		else 
		{
			return y-x;
		}
		
	}
	public static void divide(int x,int y)
	{
		if(y==0)
		{
			System.out.println("You can't divide any no by zero:");
		}
		else {
			float result=x/y;
			System.out.println("Dividition of two no is:"+result);
		}
		
	}

}
