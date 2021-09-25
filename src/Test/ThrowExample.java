package Test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =17;
		ThrowExample obj = new ThrowExample();
		try {
		obj.ageCheck(age);
		}catch(ArithmeticException e) {
		System.out.println("exception");
		}
		System.out.println("after exception");

	}
	public void ageCheck(int age) {
		if(age<18) {
			throw new ArithmeticException("age not allowed");
			
		}else {
			System.out.println("eligible");
		}
	}

}
