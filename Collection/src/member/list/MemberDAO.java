package member.list;

import java.util.ArrayList;

import member.Member;

/*
    DAO(Data Access Object) 클래스 
    - 자료형(DTO, Member)을 사용해서 삽입, 검색, 삭제하는 클래스
*/
public class MemberDAO {
	//Member를 저장할 ArrayList 객체 선언(생성)
	private ArrayList<Member> arrayList;
	
	public MemberDAO() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가(저장)
	//매개변수로 전달된 인스턴스(객체)를 arrayList에 저장함
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 전체 검색
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 삭제 - 회원 아이디를 매개로 삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			//이미 등록된 아이디와 외부에서 입력한 아이디와 비교
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) { //일치하면 삭제
				arrayList.remove(i);
				return true;
			}
		}
		
		System.out.println(memberId + "번 아이디가 존재하지 않습니다.");
		return false;
	}
}







