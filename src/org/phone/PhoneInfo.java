package org.phone;

public class PhoneInfo {

	public void phoneName() {

		System.out.println("Phone Name = Redmi");
	}

	public void phoneMieiNum() {

		System.out.println("Phone MIEI Number = MIEIRedmi00086");
	}

	public void battery() {

		System.out.println("Battery = 6000Mh");
	}

	public void ram() {

		System.out.println("RAM = 8GB");

	}
//<<<<<<< HEAD
//	
//=======
//	
//>>>>>>> a4311d4b6fc4696c97eb5a0f4cd953ca06c3eb8f

	public static void main(String[] args) {

		PhoneInfo mobile = new PhoneInfo();
		mobile.phoneName();
		mobile.phoneMieiNum();

	}
}
