package collection.arrarylist;

import java.util.ArrayList;
import collection.Member;	//멤버 클래스는 컬렉션 패키지 안에 있으므로 임포트해줘야함.

public class MemberArrayList {
	private ArrayList<Member> arrayList;	//선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	//Member 형으로 선언한  ArrayList 생성
	}
	
	//회원을 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ArrayList 특정 위치에 회원 추가하기
	public void insertMember(Member member, int index) {
		if(index < 0 || index > arrayList.size()+1) {
			System.out.println("추가할 위치가 인덱스 범위를 벗어났습니다.");
			return;
		}
		arrayList.add(index-1, member);		//인덱스는 0부터 시작하니까 내가 입력한 값에 -1 해야함.	
//		arrayList.add(member, index-1);	//이렇게 쓰면 오류난다.			
	}
	
	//회원 제거. 0번이 첫번째 회원이다.
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);	//get() 메서드로 회원을 순차적으로 가져옴.
			int tempId = member.getMemberId();	//임시 변수에 저장하고 그 값을 내가 지우려는 회원값과 비교
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;	//return 되면 해당 메서드는 종료된다.
			}
		}
		//위 for 문을 통해 해당하는 id 를 찾지 못했을 경우.
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//전체 회원 출력
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println(arrayList.size());
		System.out.println();
	}
	
	
}
