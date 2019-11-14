package bookver4;

public class PhoneInfor {

	public String name;
	public String phone;
	public String email;

	public PhoneInfor(String name, String phone, String email) {

		this.name = name;
		this.phone = phone;
		this.email = email;

	}

	public void showData() {

		System.out.println("이름 :\t" + name);
		System.out.println("전화번호 :\t" + phone);
		System.out.println("이메일 :\t" + email);

	}

	public void showBasic() {
		System.out.println(name + " " + phone);
	}

}