package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이상원";	// 클래스에서 private 처리했기 때문에 오류 발생.
		studentLee.setStudentName("이상원");	// 게터와 세터를 사용하므로 private 처리된 매개변수를 외부 클래스에서 사용할 수 있게 된다.
		System.out.println(studentLee.getStudentName());	//클래스 안에 선언된 메서드를 호출. null 값나온다. 값 자체를 입력하질 않아서.
		
	}
}
