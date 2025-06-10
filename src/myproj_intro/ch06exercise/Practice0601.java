package myproj_intro.ch06exercise;

import java.util.Scanner;

public class Practice0601 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("数値を入力 > ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("入力数値[" + num + "]は偶数です。");
		} else {
			System.out.println("入力数値[" + num + "]は奇数です。");
		}
		
	}

}
