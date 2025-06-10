package myproj_intro.ch10exercise;

public class Practice1002 {

	static void checkAge (int atmAge) {
		if (atmAge >= 20) {
			System.out.println(atmAge + "歳は通常料金です。");
		} else {
			System.out.println(atmAge + "歳は半額料金です。");
		}
	}
	
	public static void main(String[] args) {

		int age;
		
		age = 10;
		checkAge(age);
		
		age = 20;
		checkAge(age);

	}

}
