package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> { 
	// Comparable, Comparator 둘 다 구현하는 경우는 거의 없음

	private int memberId;
	private String memberName;
	
	public Member() {}
	
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
	
	public String toString() {
		
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		
		return false;
	}

	@Override
	public int compareTo(Member member) {
		
		// 내가 더 큰 경우 return을 양수로 하면 오름차순으로 정렬되는 트리 생성		
//		return (this.memberId - member.memberId);
		
		// 음수가 리턴되면 내림차순 정렬
		// return (this.memberId - member.memberId) * -1;
		
		// 이름으로 오름차순 정렬
		return (this.memberName.compareTo(member.memberName)); 
		
		// 이름으로 내림차순 정렬
		//return (this.memberName.compareTo(member.memberName)) * -1; 
	}

	@Override
	public int compare(Member member1, Member member2) { // member1이 나, member2가 비교할 애
		
		return member1.memberId - member2.memberId; // 오름차순
	}
	
	
}
