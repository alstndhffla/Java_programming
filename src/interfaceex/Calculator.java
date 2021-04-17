package interfaceex;

//추상 클래스
public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	//남은 2가지 추상메서드에 대해서는 구현하지 않았기 때문에 Calculator는
	//현재 추상 클래스이다.
}
