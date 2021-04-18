package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	//책 번호와 제목을 매개변수로 입력받는 생성자
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	
	//object 클래스의 toString메서드는 이미 최상위 클래스로서 정의되어있다.
	//그것을 해당 클래스에 맞게 오버라이드(메서드바디재정의)하여 사용한다.
	//이거 안하면 해당 파일 실행시  클래스 이름이랑 주소값이 출력된다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTitle +","+ bookNumber;
	}
	
	
	
	
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		//toString 메서드는 클래스 이름과 주소 값을 보여준다(기능)
		//클래스를 만들면 자동으로 상속받아지고 그게 사용되어짐.
		System.out.println(book1);	//인스턴스 정보(클래스 이름, 주소 값)
		//toString 메서드를 명시하지 않았지만 자동으로 호출된다. Object 클래스의 메서드.
		//클래스 이름@해시코드값 으로 출력된다.
		System.out.println(book1.toString());	//toStirng 메서드로 인스턴스 정보 보여줌
		
		String str = new String("test");
		System.out.println(str);
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
	}
}
