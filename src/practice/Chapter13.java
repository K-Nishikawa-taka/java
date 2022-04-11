package practice;

import extend.phone.MobilePhone;

public class Chapter13 {
	public static void main(String[] args) {
		//MobilePhoneクラスのインスタンスを生成
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		mobilePhone.takePicture();
		Chapter13.staticCall(mobilePhone, "99-8888-7777");
		mobilePhone.powerOff();
		
		//FlyingPhoneインスタンスを生成
		FlyingPhone flyingPhone = new FlyingPhone(5);
		flyingPhone.fly();
		Chapter13.staticCall(flyingPhone, "000-1111-2222");
		flyingPhone.powerOff();
	}
	
	public static void staticCall(extend.phone.Phone phone, String number) {
		phone.call(number);
	}
}
