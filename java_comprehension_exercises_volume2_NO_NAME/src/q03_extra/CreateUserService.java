package q03_extra;

import java.text.ParseException;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * @param memberStorage
	 */
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//TODO ここから実装する
	public boolean execute(int id, String password, String name, String birthday)
			throws IllegalInputException, ParseException {
		for (Member member : memberStorage.getMembers()) {
			if (member.getId() == id) {
				throw new IllegalInputException("IDが重複しています。再度入力してください");
			}
		}

		this.memberStorage.getMembers().add(Member.getInstance(id, password, name, birthday));
		return true;
	}
}
