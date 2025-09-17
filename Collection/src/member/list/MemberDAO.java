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
}







