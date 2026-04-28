package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		try {
			System.out.print("input id>>");
			inputId = cr.inputNumber();
		} catch (NumberFormatException | IOException e) {
			System.out.println("error!");
			e.printStackTrace();
		}

		try {
			System.out.print("input password>>");
			inputPassword = cr.inputString();
		} catch (IOException e) {
			System.out.println("error!");
			e.printStackTrace();
		}

		Member member = new Member(inputId, inputPassword, name, age, rank);

		member.showMember();

	}

}
