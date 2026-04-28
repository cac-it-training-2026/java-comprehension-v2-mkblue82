package q01_basic.question05;

public class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	/**
	 * 
	 */
	public Member() {
	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		System.out.println("---GET RANK---");
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public void buyItem() {
		System.out.println(name + " purchased the item at 50% off");
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + this.id);
		System.out.println("password:" + this.password);
		System.out.println("name:" + name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}
}
