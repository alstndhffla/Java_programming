package abstractex;

// 추상클래스 선언해야한다. 안그럼 오류.
public abstract class Computer {
//	public void display();	// 그냥 이렇게만 쓰면 함수 구현부가 없기 때문에 오류가 뜬다 -> 추상메서드로 바꿔야함.
//	public void typing();	// 그냥 이렇게만 쓰면 함수 구현부가 없기 때문에 오류가 뜬다 -> 추상메서드로 바꿔야함.
	
	//아래와 같이 abstract 추상메서드를 사용하려묜 클래스 자체도 추상 클래스가 되야한다.
	public abstract void display();	
	public abstract void typing();	
	public void turnOn() {
		System.out.println("시스템 전원을 켭니다.");		
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
