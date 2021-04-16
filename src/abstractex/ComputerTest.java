package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		//Computer c1 = new Computer();	//추상클래스는 인스턴스로 생설할 수 없어서 오류발생.
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBooK();	//추상클래스는 인스턴스로 생설할 수 없어서 오류발생.
		Computer c4 = new MyNoteBook();
		
		
	}
}
