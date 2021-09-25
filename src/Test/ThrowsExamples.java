package Test;

public class ThrowsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExamples obj = new ThrowsExamples();
		
		obj.calculator();

	}

	
	public void calculator() {
		try {
			div();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	public void div() throws ArithmeticException {
		System.out.println("inside div method");
	}
}
