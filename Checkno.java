package classesandmethod;

import java.util.Scanner;

public class Checkno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		
		check(n);
		
		
	}
	
	public static void check(int n)
	{
		if(n<100)
		{
			if(n>50)
			{
				System.out.println("n is greater then 50 but less then 100");
			}
			else
			{
				System.out.println("n is less then 50 ");
			}
		}
		else
		{
			if(n>150)
			{
				System.out.println("n is greater then 150");
			}
			else
			{
				System.out.println("n is less then 150 but greater then 100");
			}
		}

	}

}
