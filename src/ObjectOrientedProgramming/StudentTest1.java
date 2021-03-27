package ObjectOrientedProgramming;


// 만든 클래스들을 시험해보기 위해 클래스를 따로 만듦
public class StudentTest1 {
	// 메인 메소드
	public static void main(String[] args) {
		Student student1 = new Student();	// 객체 생성
		student1.studentName = "안승연";
		
		// 결과값이 같다.
		System.out.println(student1.studentName);	//만들어진 객체의 메서드
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();	
		// Student 클래스의 새끼인 새 객체 생성
		// 이 객체는 클래스의 인스턴스라고 부른다.
		
		student2.studentName = "안연수";		
		System.out.println(student2.studentName);
		System.out.println(student2.getStudentName());
		
		//참조변수 값 출력(생성된 인스턴스가  힙 메모리 어디에 저장되어있는지 
		// 주소를 알려준다.
		System.out.println(student1);
		System.out.println(student2);
	}
}
