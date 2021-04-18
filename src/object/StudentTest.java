package object;

public class StudentTest {
	public static void main(String[] args) {
		Student1 studentKim = new Student1(1000, "김민수");
		System.out.println(studentKim);
		//toString메서드 재정의로 인스턴스의 주소와 해시코드가 아니라 매개변수값을 출력해냄
		//Student.java 파일 확인해보셈.
	}
}
