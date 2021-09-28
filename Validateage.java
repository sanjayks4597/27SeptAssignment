package classesandmethod;

import java.util.Scanner;

public class Validateage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int n=sc.nextInt();
		boolean val=validateAge(n);
	}
	
	public static boolean validateAge(int n)
	{
		boolean flag=false;
		if(n>=18)
		{
			flag=true;
		}
		else 
		{
			
			flag=false;
		}
		return flag;
	}
	

}
