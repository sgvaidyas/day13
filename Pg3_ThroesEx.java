package day13;

public class Pg3_ThroesEx {

	public static void main(String[] args) {
		Pg4_ThrowsClassEx ob = new Pg4_ThrowsClassEx();
		
		try {
			ob.gettaskdone();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("FIRST");
	}

}
