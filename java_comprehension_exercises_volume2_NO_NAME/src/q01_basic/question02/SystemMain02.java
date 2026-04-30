package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member member = new Member();

		member.setName("Miura Manabu");
		member.setAge(30);
		member.setRank(1);

		System.out.println("---SHOW DATA---");

		member.showMember();

		member.rankUp();

		int newRank = member.getRank();
		System.out.println("---GET RANK---");
		System.out.println("newRank:" + newRank);
	}
}
