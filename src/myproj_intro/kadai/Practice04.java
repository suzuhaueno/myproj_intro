package myproj_intro.kadai;

import java.util.HashMap;
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		int number = 0;
		
		String name = "";
		int phone = 0;
		
		HashMap<String, Integer> phoneBook = new HashMap<>(); 
		
		while (true) {
			System.out.println("1:登録");
			System.out.println("2:検索");
			System.out.println("3:アプリ終了");
			int num = getValueInput(sin, "該当する番号を入力してください。");
			
			if (num == 1) {

				name = nameCheck(sin, "名前を入力してください。");
				
				if (phoneBook.containsKey(name)) {
					System.out.println(name + "さんは既に登録されています。");
					continue;
				}
				
				number = getValueInput(sin, "電話番号を入力してください。");
				//名前と電話番号を保存する
				phoneBook.put(name, number);
				
			} else if (num == 2) {
				
				String serchName = nameCheck(sin, "名前を入力してください。");
				
				//phoneBookの中にserchNameがあるかどうかHashMashd調べる
				if (phoneBook.containsKey(serchName)) {
					System.out.println(serchName + "さんの電話番号は" + phoneBook.get(serchName));
				
				} else {
					System.out.println( serchName + "さんは登録されていません。");
				}
				
			} else if (num == 3){
				
				System.out.println("アプリを終了します。");
				break;
				
			} else {
				System.out.println("1から3のどれかを入力してください。");
			}
		}
	}
	
	//正しい値チェック
	public static int getValueInput(Scanner scanner, String message) {
		int number = 0;
		while (true) {
			// 確認メッセージの表示
			System.out.print(message);
			// 値取得
			String line = scanner.nextLine();
			try {
				number = Integer.parseInt(line);
				return number;

			} catch (NumberFormatException e) {
				System.out.println("エラー：数字を入力してください。");
				continue;
			}
		}
	}
	//名前が空白だった場合のエラーチェック
		public static String nameCheck(Scanner scanner, String message) {
			
			while (true) {
				//確認メッセージの表示
				System.out.print(message);
				String name = scanner.nextLine();
				
				if (name.equals("")) {
					System.out.println("エラー：名前を入力してください。");
					continue;
				}
				return name;
			}
		}
		

}
