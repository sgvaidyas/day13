package day13;

public class Pg4_ThrowsClassEx {
	void gettotal(int[] a) throws Exception{
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		float per = sum/a.length;
		if(per<35)
			throw new ArithmeticException("FAIL");
		else
			System.out.println("Total = "+sum + " PER ="+per);
	}
	
	void gettaskdone() throws Exception
	{
		int a[] = new int[] {11,22,33,20};
		
		gettotal(a);
	}
}
