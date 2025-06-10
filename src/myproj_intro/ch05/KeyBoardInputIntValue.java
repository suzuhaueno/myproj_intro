package myproj_intro.ch05;

import java.util.Scanner;

public class KeyBoardInputIntValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("誕生月を入力してください。 > ");
		int birthMonth = sc.nextInt();
		System.out.println("あなたの誕生日月は、"+ birthMonth +"月です。");
		
	}

}
