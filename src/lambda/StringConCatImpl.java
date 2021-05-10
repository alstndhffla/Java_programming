package lambda;

//클래스에서 인터페이스(StringConcat)구현하기. 해당 인터페이스는 makeString이라는 추상메서드를 가지고 있으므로 재정의했다.
public class StringConCatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println( s1 + "," + s2 );
	}
}
