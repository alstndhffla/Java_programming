package interfaceex;

public interface Calc {
	//계산기를 만들기 위해 선언한 코드.
	
	//인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변한다.
	//static 으로 선안한 변수는 여러클래스에서 공통으로 사용이 가능한거고 인터페이스 내에서 선언한 변수는
	//상수로 취급받아 사용됨.
	double PI = 3.14;
	int ERROR = -999999999;

	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	//인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨.
	
	//디폴트 메서드는 인터페이스를 구현한 클래스에서 기본으로 사용할 메서드이다.
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
	
		return total;
	}	
	
}
