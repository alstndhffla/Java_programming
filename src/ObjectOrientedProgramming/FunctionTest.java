package ObjectOrientedProgramming;

public class FunctionTest {
	public static void main(String[] args) {	//반환값이 없으니 void
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(sum);
	}
	
	public static int add(int n1, int n2) {		//반환값 있으니 static
		int result = n1 + n2;
		return result;
	}
}
