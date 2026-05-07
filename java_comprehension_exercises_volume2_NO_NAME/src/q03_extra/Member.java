package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {
	/** 会員ID */
	private int id;
	/** パスワード */
	private String password;
	/** 名前 */
	private String name;
	/** 誕生日 */
	private Date birthday;
	/** ランク */
	private int rank;
	/** クーポン */
	private List<Coupon> coupons;

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
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * @return birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday セットする birthday
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 * @param coupons
	 */
	public Member(int id, String password, String name, Date birthday, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.rank = rank;

		this.coupons = new ArrayList<>();
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + sdf.format(birthday)
				+ ", rank="
				+ rank + ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

	public static Member getInstance(int id, String password, String name, String birthdayString)
			throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date birthday = sdf.parse(birthdayString);

		Member member = new Member(id, password, name, birthday, (int) ((Math.random() * 3) + 1));

		member.coupons.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		member.coupons.add(Coupon.getInstance(2, 0.25, "今月の特典"));

		return member;
	}
}
