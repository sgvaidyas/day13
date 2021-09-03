package day13;

import java.util.Scanner;

class UserDefined extends Exception
{
	public UserDefined(String s)
	{
		super(s);
	}
}
public class Pg2_classthrow {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("enter marks = ");
		int marks = ob.nextInt();
		try
		{
			if(marks<60)
				throw new UserDefined("Marks not in range");
			else
				System.out.println("you can participate");
		}
		catch(UserDefined e)
		{
			System.out.println(e);
		}
	}

}
