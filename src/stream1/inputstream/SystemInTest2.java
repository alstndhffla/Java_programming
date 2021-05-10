package stream1.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			while( (i = System.in.read()) != '\n' ) {	//while문에서 read()메서드로 한 바이트를 반복해 읽음.
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
