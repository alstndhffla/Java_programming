package collection.hashSet;

import java.util.HashSet;

//해쉬셋은 중복을 허용하지 않는다. 말그대로 집합이라 입력순서에 따라 들어가는게 아니다.
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));	//오류는 안나는데 중복값 안들어감.
		
		System.out.println(hashSet);
		
	}
}
