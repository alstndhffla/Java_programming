package generics;

// 좌표점이 될 변수 선언. 점의 좌표가 정수일지 실수일지 모르니까  제네릭 프로그래밍을 함.
public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
		
	//T and V is 자료형 매개변수
	//아래 2개는 제네릭 메서드. 
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
	
}
