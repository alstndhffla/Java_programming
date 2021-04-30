package collection;

//collection 패키지 내에서 공통으로 사용할 멤버 클래스를 미리 작성함.
//트리셋을 사용할 때 비교하는 값과 기준값을 두기 위해 comparable 을 상속받아야 한다(compareTo메서드)
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//메서드 재정의. 기본으로 제공되는 메서드를 재정의.
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberId;	//hashCode()가 회원 아이디를 반환하도록 재정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			//매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	//추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교함.
	//MemberTreeSetTest 클래스를 실행하기 위해 필요한 메서드 재정의 부분.
	//treeset 을 사용했기 때문에 비교값과 기준값을 지정해줘야하기 때문.
	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId);
	}
	
	//출력 결과를 회원 이름 순으로 정렬되도록 메서드 재정의
//	@Override
//	public int compareTo(Member member) {
//		return this.memberName.compareTo(memberName);
//	}
}
