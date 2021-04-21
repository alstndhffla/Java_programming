package generics;

//파우더와 플라스틱 액체를 재료로 모형을 출력하는 프린터를 제네릭 클래스로 정의
//extends 에약어로 사용할 수 있는 자료형에 제한을 둠.
public class GenericPrinter<T extends Material> {
	private T material;	//T 자료형으로 선언한 변수

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;	//T 자료형 변수 material을 반환하는 제네릭 메서드
	}
	
	public String toString() {
		return material.toString();
	}
	
	//이거 왜 오류지???
	public void printing() {
		material doPrinting();
	}
}
