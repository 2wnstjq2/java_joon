package bookver5;

public class PhoneUnivInfor extends PhoneInfor {
	
	String address;
	String major;
	String year;
	
	public PhoneUnivInfor(String name, String phoneNumber, String email, String addr, String major, String year) {
		
		super(name, phoneNumber, email);
		this.address = addr; 
		this.major = major;
		this.year = year;
	}
	
	public void showData() {
		super.showData();
		System.out.println("주소 :\t"+address);
		System.out.println("전공 :\t"+major);
		System.out.println("학년 :\t"+year);
	}
	
	public void BasicInfor() {
		super.showBasic();		
	}
	
	
}
 