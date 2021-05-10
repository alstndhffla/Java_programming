package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AutoCloseTest2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		try(AutoCloseObj obj = new AutoCloseObj()){    	
			throw new Exception();	//강제예외발생
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
