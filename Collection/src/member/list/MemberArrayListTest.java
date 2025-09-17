package member.list;

import member.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// MemberDAO 인스턴스 생성
		MemberDAO dao = new MemberDAO();
		
		//회원 등록
		dao.addMember(new Member(1001, "이정후"));
		dao.addMember(new Member(1002, "신유빈"));
		dao.addMember(new Member(1003, "우상형"));
		
		//회원 검색
		dao.showAllMember();

	}

}
