package day13;

import java.util.Scanner;

public class Pg_5_DLLImplement {

	public static void main(String[] args) {

		DLL ob = new DLL();
		int ch,ele=0,pos=0;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("1 INSERT BEGIN");
			System.out.println("2 INSERT END");
			System.out.println("3 INSERT POS");
			System.out.println("4 DELETE BEGIN");
			System.out.println("5 DELETE END");
			System.out.println("6 DELETE POS");
			System.out.println("7 DISPLAY");
			System.out.println("8 EXIT");
			ch=s.nextInt();
			if(ch>=1 && ch<=3)
			{
				System.out.println("Enter the element = ");
				ele=s.nextInt();
			}
			switch(ch)
			{
				case 1 : ob.insertbegin(ele);break;
				case 2: ob.insertend(ele);break;
				case 3:do
						{
							System.out.println("Enter valid pos = ");
							pos=s.nextInt();
						}while(pos<1 || pos>ob.count+1);
						ob.insertpos(pos,ele);
						break;
				case 7: ob.display();break;
				case 8: break;
				default:System.out.println("Invalid choice");
			}			
		}while(ch!=8);
	}
}
