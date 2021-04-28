package generics;

// 두 p1(x, y), p2(x, y) 좌표를 통해 직사각형의 넓이를 구한다.
public class GenericMethod {
	//제네릭 메서드. (좌표가 정수인지 실수인지 모르기 때문에 제네릭 프로그래밍)
	public static<T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;	//double 자료형으로 return
		
		
	}
	
	public static void main(String[] args) {
		
		//두 정수와 실수를 값으로 가지는 두 좌표를 변수로 선언
		//앞에서 <Integer, Double>을 명시했기 때문에 뒤에서 <> 안에 명시해도 되고 안해도 된다.
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		//double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);	//<>안에 써도 되고 안써도 되고.
		
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
		
	}
}
