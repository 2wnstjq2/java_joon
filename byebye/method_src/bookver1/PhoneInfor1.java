package bookver1;

public class PhoneInfor1 {// 전화번호(객체) 저장(메모리(변수)에 데이터저장), 수정, 삭제, 보기// crud

	public String name;
	public String phoneNumber;
	public String birthday;

	public PhoneInfor1(String name, String phoneNumber, String birthday) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public PhoneInfor1(String name, String phoneNumber) {

		this(name, phoneNumber, " ");

	}

	public void showInfor() {
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(birthday);

	}

}
