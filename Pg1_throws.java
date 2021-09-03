package day13;

import java.util.Scanner;

public class Pg1_throws {
	public static void eligibility(int marks)
	{
		if(marks<60)
			throw new ArithmeticException("Marks not in range");
		else
			System.out.println("you can participate");
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter marks = ");
		int marks = ob.nextInt();
		try
		{
			eligibility(marks);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error  = "+e);
		}		
		System.out.println("line after fun call");		
	}	
}
