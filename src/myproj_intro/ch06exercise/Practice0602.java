package myproj_intro.ch06exercise;

import java.util.Scanner;

public class Practice0602 {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in);
		System.out.println("成績を入力(1~5)-->");
		int grad = sin.nextInt();
		
		switch (grad) {
		case 1:
			System.out.println("もっと頑張りましょう!");
			break;
		case 2:
			System.out.println("もう少し努力が必要です。");
			break;
		case 3:
			System.out.println("さらに良い成績を目指しましょう。");
			break;
		case 4:
			System.out.println("良い成績です。");
			break;
		case 5:
			System.out.println("最高の成績です。");
			break;
		default :
			System.out.println("1~5の数値を入力してください!");		
			break;
		}
	}

}
