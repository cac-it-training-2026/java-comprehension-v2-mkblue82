package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader con = new ConsoleReader();

		Member member = null;

		int inputId;
		String inputPassword;

		while (!isLogin) {
			System.out.print("input id>>");
			try {
				inputId = con.inputNumber();
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				System.out.println("不正な入力です。再度入力してください");
				e.printStackTrace();
				continue;
			}
			try {
				System.out.print("input paqssword>>");
				inputPassword = con.inputString();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return;
			}

			member = loginService.doLogin(inputId, inputPassword);

			if (member == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
				continue;
			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
				break;
			}

		}

		member.showMember();
	}

}
