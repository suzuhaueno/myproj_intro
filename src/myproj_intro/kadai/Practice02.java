package myproj_intro.kadai;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		int number1 = 0;
		int number2 = 0;
		
		String ope;
		
//		boolean isKeisan = true;

		while (true) {
				number1 = getValueInput(sin, "1つ目の整数を入力してください。");
				
				number2 = getValueInput(sin, "2つ目の整数を入力してください。");

				while (true) {
					System.out.println("計算に用いる演算子を入力してください");
					ope = sin.nextLine();
					
					// エラーチェック
					if ((ope.equals("+") || ope.equals("-") || ope.equals("*") || ope.equals("/")) == false) {
						System.out.println("エラー：有効な演算子を入力してください。");
						continue;
					}
					
					// 計算
					operater(ope,  number1, number2);
					break;
				}
				
				
				System.out.println("アプリを終了しますか？（y / n）");
				String end = sin.nextLine();
				if (end.equals("y")) {
					System.out.println("アプリを終了します。");
					System.exit(0);
				} else {
					System.out.println("アプリを継続します。");
					continue;
				}
		}
	}
	
	//正しい値チェック
	public static int getValueInput(Scanner scanner, String message) {
		int number = 0;
		while (true) {
			System.out.println(message);
			String line = scanner.nextLine();
			try {
				number = Integer.parseInt(line);
				if (number < 0) {
					System.out.println("0以上で入力してください。");
				} else {
					return number;
				}
			} catch (NumberFormatException e) {
				System.out.println("エラー：有効な整数を入力してください。");
				continue;
			}
		}
	}
	
	//計算値表示
	public static void  operater(String ope, int number1, int number2) {
		
		if (ope.equals("+")) {
			System.out.println(number1 + ope + number2 + " = " + (number1 + number2));
		} else if (ope.equals("-")) {
			System.out.println(number1 + ope + number2 + " = " + (number1 - number2));
		} else if (ope.equals("*")) {
			System.out.println(number1 + ope + number2 + " = " + (number1 * number2));
		} else if (ope.equals("/")) {
			if (number2 == 0) {
				System.out.println("入力された整数に0があるため計算不可です。");
			} else {
				System.out.println(number1 + ope + number2 + " = " + (number1 / number2));
			}
		}else {
			System.out.println("演算子を入力してください。");
			
		}
	}
	
	
}