package org.phone;

public class PhoneInfo {

	public void phoneName() {

		System.out.println("Phone Name = Redmi");
	}
	
	public void phoneMieiNum() {

		System.out.println("Phone MIEI Number = MIEIRedmi00086");
	}
	
	
	public static void main(String[] args) {
		
		PhoneInfo mobile = new PhoneInfo();
		mobile.phoneName();
		mobile.phoneMieiNum();
		

	}
}
