package stream1.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			i = System.in.read();	//read() 메서드로 한바이트 읽음
			System.out.println(i);
			System.out.println((char)i);	//문자로 변환하여 출력
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
