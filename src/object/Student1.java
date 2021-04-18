package object;

public class Student1 {
	int studentID;
	String name;
	
	public Student1(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	//기본적으로 object클래스가 상속되어져 있기 때문에 해당 클래스의 메서드를 오버라이드 할 수 있다.
	@Override
	public String toString() {
		return studentID + "," + name;
	}
	
	//equals 메서드 재정의
	//재정의한 메서드는 학생의 학번 값이 같으면 true 반환.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//obj 가 참조하고 있는 클래스가 Student 클래스가 맞다면 true, 아니면 false 
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	
}
