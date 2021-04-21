package generics;

//재료에 제한을 두기 위해 material 을 상속시킴
public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
