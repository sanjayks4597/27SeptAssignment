package classesandmethod;

import java.util.Scanner;

public class CircumfanceAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of cirle for calculating area and Perimeter:");
		
		int radius=sc.nextInt();
		float pi=3.14f;
		perimeter(radius,pi);
		area(radius,pi);
		

	}
	public static void perimeter(int r,float pi)
	{
		
		float result=2*pi*r;
		System.out.println("Perimeter of circle is :"+result);
	}
	
	public static void area(int r,float pi)
	{
		
		float result=pi*r*r;
		System.out.println("Area of circle is :"+result);
	}

}
