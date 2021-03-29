package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		
		bookArray1[0] = new Book("태백산맹", "조정래");
		bookArray1[1] = new Book("패스트", "외국인");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i =0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("개새끼");
		bookArray1[0].setAuthor("임경헌");
		
		System.out.println("---------------1---------------");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		
		System.out.println("---------------2--------------");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		System.out.println("------------------------------------------------------------");		
		System.out.println("객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니고 인스턴스의 주소값. -> 주소값만 복사(얇은 복사)");
		System.out.println("깊은 복사 -> 인스턴스를 따로 관리하고 싶다면 직접 인스턴스를 만???들고 그 값을 복사(깊은 복사)");
		System.out.println("------------------------------------------------------------");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());			
		}
		
		for(int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박원서");
		
		System.out.println("-------------------1-------------------");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("-------------------2-------------------");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}		
	}
}
