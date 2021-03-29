package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);	// 변수의 초기값 출력
		studentLee.serialNum++;	//변수 값 상승
		
		Student studentKim = new Student();
		studentKim.setStudentName("김민수");
		System.out.println(studentKim.serialNum);	// 해당 변수값은 이미 상승해있다. 모든 인스턴스가 하나의 클래스 변수만을 참조하고 있기 때문.
		
	}
}
