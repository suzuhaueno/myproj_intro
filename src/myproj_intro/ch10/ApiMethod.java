package myproj_intro.ch10;

import java.util.Scanner;

public class ApiMethod {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in);
		System.out.print("1つ目の整数を入力してください。⇒");
		String strNum1 = sin.nextLine();
		//Integer.parseIntメソッド：inuNum1の値をint型に変更
		int intNum1 = Integer.parseInt(strNum1);
		
		System.out.print("2つ目の整数を入力してください。⇒");
		int intNum2 = sin.nextInt();
		
		if (intNum1 != intNum2) {
			//Math.maxメソッド：引数に2つのint型を受け取り、大きい値を戻り値にする
			int maxNum = Math.max(intNum1, intNum2);
			System.out.println(intNum1 + "と" + intNum2 + " では" + maxNum + "のほうが大きいです。");
		} else {
			System.out.println(intNum1 + "と" + intNum2 + "は等しいです。");
		}
		
	}

}
