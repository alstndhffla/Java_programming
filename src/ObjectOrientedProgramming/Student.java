package ObjectOrientedProgramming;

// 클래스의 전체 이름은 ObjectOrientedProgramming.Student 가 된다.
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ":" + address);
	}
	
	//갖고옴
	public String getStudentName() {	//반환하는 자료형에 맞게 String
		return studentName;
	}
	
	//가져다 집어넣음
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();	
		// Student 클래스의 새끼인 새 객체 생성
		// 이 객체는 클래스의 인스턴스라고 부른다.
		
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
