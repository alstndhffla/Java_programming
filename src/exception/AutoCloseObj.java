package exception;

public class AutoCloseObj implements AutoCloseable{
	
	//인터페이스 AutoCloseable에 있는 close()메서드 재정의
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되엇습니다.");
	}
}
