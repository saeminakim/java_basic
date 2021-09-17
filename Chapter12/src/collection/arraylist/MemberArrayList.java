package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tmpId = member.getMemberId();
//			
//			if(memberId == tmpId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tmpId = member.getMemberId();
			if(memberId == tmpId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		
//		System.out.println(arrayList);
	}
}
