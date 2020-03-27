package bookver4;

public class PhoneMoim extends PhoneInfor{

	String activity;
	
	public PhoneMoim(String name, String phoneNumber, String email, String activity) {
		
		super(name, phoneNumber, email);
		this.activity = activity;
		
	}
	
	public void showData() {
		super.showData();
		System.out.println("활동 :\t"+activity);		
	}
	
	public void BasicInfor() {
		super.showBasic();		
	}


}
