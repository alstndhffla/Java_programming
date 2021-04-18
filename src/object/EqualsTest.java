package object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이덕주");
		Student studentLee2 = studentLee;	//위 인스턴스와 같은 주소를 사용(힙 메모리)
		Student studentSang = new Student(100, "이덕주");
		//매개변수 값은 같으나 인스턴스 주소는 다르다(힙 메모리영역)
		
		if(studentLee == studentLee2)
			System.out.println("studentLee 와 studentLee2 주소는 같다.");
		else
			System.out.println("studentLee 와 studentLee2 주소는 다르다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee 와 studentLee2 동일하다");
		else
			System.out.println("studentLee 와 studentLee2 동일하지 않다.");
		
		
		if(studentLee == studentSang)
			System.out.println("studentLee 와 studentSang 주소는 같다.");
		else
			System.out.println("studentLee 와 studentSang 주소는 다르다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee 와 studentSang 동일하다");
		else
			System.out.println("studentLee 와 studentSang 동일하지 않다.");
		
		System.out.println("stydentLee의 hashCode :" + studentLee.hashCode());
		System.out.println("stydentSang의 hashCode :" + studentSang.hashCode());
		
		System.out.println("studentLee의 실제값 :" + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제값 :" + System.identityHashCode(studentSang));
	}
}
