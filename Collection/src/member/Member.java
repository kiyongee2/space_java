package member;

/*
    DTO(VO - Data Transfer Object) 클래스
    - 자료형으로 참조되는 클래스
 */
public class Member {
	private int memberId;       //회원 아이디
	private String memberName;  //회원 이름
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//setter, getter
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
	
}
