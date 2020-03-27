package com.park.tb;


public class Space {
	
	int code;
	boolean able;// true : 빈 자리
	String carNumber;

	public Space(int code, boolean able,String carNumber,int space[][]) {
		// 주차 들어온 차량 정보	
		this.code=code;
		this.able=able;
		this.carNumber=carNumber;
	}
	
	public int getCode() {
		
		return code;
	}
	
	public void setCode(int code) { // 코드
		
		this.code = code;
		
	}
		
	public boolean getAble() {
		
		return able;
	}
	
	public void setAble(boolean able) { // 가능여부
		
		this.able = able;
	}
	
	public String carNumber() {
		
		return carNumber;
	}
	
	public void carNumber(String carNumber) {
		this.carNumber = carNumber;
	
	}
	
	

}

	