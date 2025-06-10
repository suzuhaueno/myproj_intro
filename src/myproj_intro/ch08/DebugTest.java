package myproj_intro.ch08;

import java.util.Scanner;

public class DebugTest {

	public static void main(String[] args) {
		
		/*ランダムに作成した数字とユーザーが入力した数字を比較し、
		 * 一致したら「当たり」、不一致なら「ハズレ」と表示するプログラム*/
		
		int randomNum = (int)(Math.random() * 10);
		int playerNum;
		
		System.out.print("0から9までの数字を入力してください　＞");
		playerNum = readInt();
		
		//ランダムに生成した数値とユーザーが入力した数値を比較する
		if (randomNum == playerNum) {
			System.out.println("[当たり]");
		} else {
			System.out.println("[ハズレ]");
		}

	}
	
	/*ユーザーに値を入力させる。
	 * 
	 * @retun 入力された数値*/
	static int readInt() {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		return i;
	}

}

