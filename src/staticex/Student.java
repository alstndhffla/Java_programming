package staticex;

public class Student {
	public static int serialNum = 1000;	// 앞으로 생성될 인스턴스 전체가 공유하게 될 클래스 변수(static 변수)
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		studentName = studentName;
	}
}
