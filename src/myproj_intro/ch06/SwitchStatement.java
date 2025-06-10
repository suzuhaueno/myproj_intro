package myproj_intro.ch06;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("1.お茶 2.コーヒー 3,紅茶 4,ミネラルウォーター");
		System.out.print("お好きな飲み物の番号を入力してください。 > ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("100円になります。");
			break;
		case 2:
			System.out.println("200円になります。");
			break;
		case 3:
			System.out.println("300円になります。");
			break;
		case 4:
			System.out.println("400円になります。");
			break;
		default :
			System.out.println("番号が不正です。");
			break;
		}

	}

}
