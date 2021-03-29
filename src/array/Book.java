package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}	//생성자

	public Book(String bookName, String author) {
		super();	// ??????
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 책 정보 출력.
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
	
	
	
	
	
}
