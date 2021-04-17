package interfaceex;

public interface MyInterface extends X, Y{
	void myMethod();
	//인터페이스는 여러개 상속받을 수 있고, 현재 이 인터페이스는 총 3개의 추상메서드를 사용할 수 있다.
	//X, Y 가 각각 하나씩 추상메서드를 가지고 있기 때문
}
