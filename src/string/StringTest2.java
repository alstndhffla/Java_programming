package string;

public class StringTest2 {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);	//두 문자열을 연결해(concat) javaStr 대입
		//문자열은 불변하므로 변수 값 자체가 변하는 것이 아니라 새로운 문자열이 생성된 것이고 
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
	}
}
