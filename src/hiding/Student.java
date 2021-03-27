package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;		
	}
	public void setStudentName(String stidentName) {
		this.studentName = studentName;		
	}
	
	// 게터와 세터는 private 으로 선언된 매개변수를 외부 클래스에서 사용할 때 쓴다.
	// Source 에서 제너레이트 게터/세터 누르면 됨. 매개변수별 게터세터생성가능
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
}
