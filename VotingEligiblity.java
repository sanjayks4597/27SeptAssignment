package classesandmethod;

import java.util.Scanner;

public class VotingEligiblity {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int n=sc.nextInt();
		Eligiblity(n);
		

	}
	
	public static void Eligiblity(int n)
	{
		if(n>=18)
		{
			System.out.println("You are eligible for voting..." );
		}
		else 
		{
			System.out.println("YOur are not eligible for voting.. ");
		}
	}

}
