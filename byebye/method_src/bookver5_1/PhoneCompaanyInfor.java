package bookver5_1;

public class PhoneCompaanyInfor extends PhoneInfor {
	
	String company;
	
	public PhoneCompaanyInfor(String name, String phoneNumber, String email, String company) {
		
		super(name, phoneNumber, email);
		this.company = company;
		
	}
	
	public void showData() {
		super.showData();
		System.out.println("회사명 :\t"+company);		
	}
	
	public void BasicInfor() {
		super.showBasic();
		
	}

	
}
