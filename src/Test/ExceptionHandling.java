package Test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int[] b = {1,2,3};
		try {
			System.out.println(a/0);
			System.out.println(b[5]);
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("inside null pointer");
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("inside arithmetic");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("inside generic exception");
		}
	finally {
		System.out.println("finally inside ");
	}
	
	System.out.println("after exception");
	}
}
