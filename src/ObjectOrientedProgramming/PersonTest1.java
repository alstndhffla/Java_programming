package ObjectOrientedProgramming;

public class PersonTest1 {
	public static void main(String[] args) {
		Person1 personKim = new Person1();
		
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		// 위처럼 외부 클래스에 값을 지정하지 못하는 경우가 있기 때문에
		
		Person1 personLee = new Person1("이순신", 175, 75);	
		//위 메서드 처럼 매개변수가 있는 생성자를 구현하고 이를 사용하는 것이 편리한 경우가 많다.
	
		
	}
}
