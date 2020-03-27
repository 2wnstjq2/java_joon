package bookver4;

public class PhoneInfor {
 
	//상속의 목적
	public String name;
	public String phone;
	public String email;

	//초기화 매서드 : 생성자 - 기본데이타
	public PhoneInfor(String name, String phone, String email) {

		this.name = name;
		this.phone = phone;
		this.email = email;

	}

	public void showData() {

		System.out.println("이름 :\t" + this.name);
		System.out.println("전화번호 :\t" + this.phone);
		System.out.println("이메일 :\t" + this.email);

	}

	public void showBasic() {
		System.out.println(name + " " + this.phone);
	}

}