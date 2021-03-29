package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);	//노란색 밑줄의 의미는 static 변수를 참조하므로 클래스명으로 참조하라고 알려주는 것
		System.out.println(Student1.serialNum);	//클래스명을 입력해 참조하니 노란색밑줄 사라짐.
	}
}
