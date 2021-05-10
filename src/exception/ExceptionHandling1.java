package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
		 	//System.out.println(e);	//예외 클래스의 toString()메서드 호출
			//return;
			e.printStackTrace();
		} 
		//System.out.println("여기도 수행됩니다.");
	}
}
