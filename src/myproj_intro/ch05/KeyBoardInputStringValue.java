package myproj_intro.ch05;

import java.util.Scanner;

public class KeyBoardInputStringValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1つ目の数字を入力してください。 > ");
		String str = sc.nextLine();
		int num1 = Integer.parseInt(str);
		System.out.println("2つ目の数字を入力してください。 > ");
		str = sc.nextLine();
		int num2 = Integer.parseInt(str);
		System.out.println(num1 + " + " + num2 +" = " + (num1 + num2));

	}

}
