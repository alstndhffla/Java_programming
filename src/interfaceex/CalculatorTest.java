package interfaceex;

//테스트 코드
public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();	//클래스 생성.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();//디폴트 메서드 호출
		//생성한 클래스가 추상클래스의 인스턴스이고 그 추상 클래스가 인터페이스를 구현한 상위 클래스를 extends했기 때문에
		//디폴트 메서드를 사용할 수 있다(상속받았다)
		
		//인터페이스에 구현된 정적메서드 사용.
		//static 예약어가 사용된 변수, 메서드들은 클래스를 생성할 필요없이		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}
