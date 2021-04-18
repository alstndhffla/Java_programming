package object;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);	//두 인스턴스의 주소가 같은지
		System.out.println(str1.equals(str2));	//두 인스턴스의 값(문자열)이 같은지
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		//equals 메서드는 인스턴스의 매개변수 값을 비교해준다.
	}
}
