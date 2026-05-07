package q03_extra;

import java.util.List;

public class MemberManager {
	private MemberManager() {
		;
	}

	public static void ShowCreateUser(List<Member> members, int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				member.showMember();
			}
		}
	}
}
