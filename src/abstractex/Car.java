package abstractex;

public abstract class Car {
	//추상 메서드 하위 클래스가 어떤 클래스냐에 따라 구현 코드가 달라진다.
	public abstract void run();
	public abstract void refuel();
	
	//구현된 메서드: 상속받게 될 클래스들이 재정의할 수도 있지만 그냥 사용할 수도 있다.
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
		
	
}
