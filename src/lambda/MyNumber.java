package lambda;

//함수형 인터페이스. 애너테이션을 선언하는 이유도 메서드가 2개일 경우, 오류를 뽑아내기 위함이다(한개의 람다식 메서드만 가능)
@FunctionalInterface
public interface MyNumber {
	
	int getMax(int num1, int num2);	//추상메서드 선언. 입력받은 두 수 중 더 큰 수 를 반환하는 기능을 구현할 것이다.
	
	//int add(int num1, int num2);	
	//람다식은 이름이 없는 익명 함수로 구현하기 때문에 인터페이스에 메서드가 여러개 있다면 어떤 메서드를 구현한 것인지 모호해진다.
	//그래서 하나의 인터페이스에 오직 하나의 람다식 메서드만 구현해야한다.
}
