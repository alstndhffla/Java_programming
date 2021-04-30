package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;	//키와 값 선언한 해시맵
	
	//생성자 생성
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//해시맵에 회원을 추가하는 메서드
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);	//키-값 쌍으로 추가
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {	//해시맵에 매개변수로 받은 키 값인 회원 아이디가 있다면
			hashMap.remove(memberId);	//해당회원 삭제
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;		
	}
	
	
	//Iterator를 사용해 전체 회원을 출력하는 메서드
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {	//다음 key가 있으면
			int key = ir.next();	//key 값을 가져와서
			Member member = hashMap.get(key);	// key로부터 value 가져오기
			System.out.println(member);			
		}
		System.out.println();
	}
	
	

}
