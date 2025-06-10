package myproj_intro.ch10;

import java.util.Scanner;

public class PracticeReview {
	
	//文字列が整数に変換可能か判定する
	static boolean isInteger(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e){
			return false;
		}
	}
	
	
	//文字列が浮動小数点として解釈可能か判定
	static boolean isDouble(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	
	//数値が入力されるまでループする
	//0より大きい値を入力しているか判定
	static int  getNumber(Scanner scanner, String message) {
		String text;
		int number = 0;
		//有効な入力かどうかのフラグ
		boolean isValid = false;
		while (!isValid) {
			System.out.println(message);
			text = scanner.nextLine();
			if(isInteger(text)) {
				number = Integer.parseInt(text);
				isValid = true;
			} else {
				System.out.println("エラー；数値を入力してください。");
			}
		}
		return number;
	}
	
	
	//年齢チェック
	static void checkAge(int ageValue) {
		if (ageValue >= 20) {
			System.out.println("成人です。");
		} else if (ageValue < 0) {
			System.out.println("エラー：0以上を入力してください。");
		} else {
			System.out.println("未成年です。");
		}
	}
	
	
	//四則演算
	static void mathNumber(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		if(num2 == 0) {
			System.out.println("0で割ることはできません。");
		} else {
			System.out.println(num1 + " / " + num2 + " = " + (double)(num1 / num2));
		}
	}
	
	
	//九九表の表示
	static void kukuTable() {
		for (int i = 1; i <= 9;i++) {
			for (int j = 1; j <= 9; j++) {
				//printfは複数の異なるデータ型を指定したフォーマットに従って1つの文字列として出力する機能がある
				System.out.printf("%3d", (i * j));
			}
			System.out.println();
		}
	}
	
	
	//テストの点数入力
	static String[] inputScore(int number, Scanner scanner) {
		String[] scoreInput = new String[number];
		for (int i = 0; i < number; i++) {
			boolean isValidScore = false;
			while (!isValidScore) {
				System.out.println((i + 1) +"人目のテストの点数を入力してください・-->");
				//受け取った値がscannerなのでscannerをscoreに入れる処理を書く
				String score = scanner.nextLine();
				if (isInteger(score)) {
					scoreInput[i] = score;
					isValidScore  = true;
				} else {
					System.out.println("エラー：数値を入力してください。");
				}
			}
		}
		return scoreInput;
	}
	
	
	//テストの合計点数・平均点数を表示する
	static void testScore(String[]  scoreTexts, int count) {
		//合計を入れる変数
		int sum = 0;
		//平均を入れる変数
		double ave = 0;
		//拡張for文は、for(型　変数名 : 配列名かコレクション名)で書く
		for (String scoreText : scoreTexts) {
			//scoreTextが数値で表現できたら(trueが返ってきたら)
			if (isInteger(scoreText)) {
				//scoreTextを数値にする
				int score = Integer.parseInt(scoreText);
				sum += score;
				if (score < 0 || score >100 ) {
					System.out.println("エラー：1～100までで入力してください。");
					continue;
				}
			}
		}
		
		ave = sum / count;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + ave);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "うえの";
		String hobby = "バンド";
		int age = 22;
		
		System.out.println("名前：" + name + "\n趣味：" + hobby + "\n年齢：" + age);

		
		//年齢入力
		int Age = getNumber(sc, "年齢を入力してください。-->");
		checkAge(Age);
		
		System.out.println();
		
		
		//四則演算のための整数入力
		int num1 = getNumber(sc, "1つ目の整数を入力してください。-->");
		int num2 = getNumber(sc, "２つ目の整数を入力してください。-->");
		mathNumber(num1, num2);
		
		
		System.out.println();
		
		//九九表の表示
		kukuTable();
	
		System.out.println();
		
		//テストの計算
		String[] studentScores =inputScore(5, sc);
		testScore(studentScores, 5);
		
		sc.close();
		
	}

}
