package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//인스턴스가 매번 새로 생성되므로 str1과 str2의 주소 값이 다름.
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		//문자열 값은 같으므로 true 반환(논리적으로 같다는 것)
		
		String str3 = "abc";
		String str4 = "abc";
		
		//문자열 abc는 상수 풀에 저장되어 있으므로 str3과 str4가 가리키는 주소 값이 같음.
		//같은 abc를 다른 변수가 바라보고 있는 상황인거임.
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		//문자열(논리값)도 같으니 true 반환.
	}
}
