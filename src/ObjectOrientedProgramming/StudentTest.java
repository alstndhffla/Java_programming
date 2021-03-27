package ObjectOrientedProgramming;


// 만든 클래스들을 시험해보기 위해 클래스를 따로 만듦
public class StudentTest {
	// 메인 메소드
	public static void main(String[] args) {
		Student studentAhn = new Student();	// 객체 생성
		studentAhn.studentName = "안승연";
		
		// 결과값이 같다.
		System.out.println(studentAhn.studentName);	//만들어진 객체의 메서드
		System.out.println(studentAhn.getStudentName());
	}
}
