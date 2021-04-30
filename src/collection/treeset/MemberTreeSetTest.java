package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박명수"); 
		Member memberLee = new Member(1001, "이지원"); 
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동"); 	//회원번호가 같은 아이디 중복회원 추가
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
	}

}
