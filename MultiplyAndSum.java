package classesandmethod;

import java.util.Scanner;

public class MultiplyAndSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first no:");
		int x=sc.nextInt();
		
		System.out.println("Enter your second no:");
		int y=sc.nextInt();
		
		int add=addition(x,y);
		int multiply=multiply(x,y);
		
		System.out.println("Addition of your given no is :"+add);
		System.out.println("Addition of your given no is :"+multiply);

	}
	
	public static int addition(int x,int y)
	{
		return x+y;
	}
	public static int multiply(int x,int y)
	{
		return x*y;
	}

}
