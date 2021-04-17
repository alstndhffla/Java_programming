package interfaceex;

public class CompleteCalc extends Calculator{
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;	//num2가 0. 즉, 나누는 수가 0인 경우에 대해 오류 반환.
	}
		
	public void showInfo() {
		System.out.println("Calc인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();	//기본적으로 인터페이스에서 정의한 디폴트메서드를 사용한다는 의미의 코드
		//최종 하위 클래스에서 인터페이스의 디폴트메서드를 재정의해서 사용할 수도 있다(위 코드를 지우고 다시 쓰면 됨)
	}
	
	
}
