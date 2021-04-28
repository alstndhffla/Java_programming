package collection.arrarylist;
import collection.Member;

//회원 추가, 삭제 테스트 클래스
public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//새로운 회원 인스턴스 생성.
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서휜");
		Member memberHong = new Member(1004, "홍길동");
		
		//회원 추가
		memberArrayList.addMember(memberLee);	
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();	//전체회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberId());	//홍길동 회원 삭제
		memberArrayList.showAllMember();	//홍길동 회원 삭제 후 전체 회원 출력
		
		memberArrayList.insertMember(memberHong, 4);
		memberArrayList.showAllMember();	
		
	}
}
