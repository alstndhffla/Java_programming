package cooperation;

// 클래스 그 자체
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	// 생성자 메서드
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;		
	}
	
	
	//행동 메서드 
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 정보 표시 메서드
	public void showInfo() {
		System.out.println(studentName + money);
	}
}
