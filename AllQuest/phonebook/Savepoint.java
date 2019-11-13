package project;

public class Savepoint {

	public String name;
	public String phoneNumber;
	public String birthday;

	public Savepoint(String name, String phoneNumber, String birthday) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;

	}

	public Savepoint(String name, String phoneNumber) {
		this(name, phoneNumber, " ");

	}

	public void showMe() {

		String exp = name+" "+phoneNumber+" "+birthday;
		
		System.out.println(exp);


	}

}