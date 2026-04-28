package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {
		;
	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				break;
			} else {
				System.out.println("該当者はいませんでした。");
				break;
			}
		}
	}
}
