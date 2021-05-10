package lambda;

//람다식 구현과 호출
public class TestMyNumber {

	public static void main(String[] args) {
		//두 수를 입력받아서 둘 중 더 큰 수를 반환
		MyNumber max = (x, y)->(x>= y)? x:y; //람다식을 인터페이스형 max 변수에 대입

		System.out.println(max.getMax(10, 20));	//인터페이스형 변수로 메서드 호출.
		
	//	MyNumber max2 = (x, y)-> x>=y ?x:y;
	//	System.out.println(max2.getMax(10, 20));
	}
}
