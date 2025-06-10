package myproj_intro.kadai;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		while (true) {
			String value = "";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("文字列を入力してください。-->");
			String st = sc.nextLine();
			
			for (int i = st.length() - 1; i >=  0; i--) {
				
				value += st.charAt(i);
			}
			System.out.println("--反転後--");
			System.out.println(value);
			
			System.out.println("アプリを終了しますか(y / n)-->");
			String end = sc.nextLine();
			if (end.equals("y")) {
				System.out.println("アプリを終了します。");
				System.exit(0);
			} else {
				System.out.println("プログラムの実行を継続します。");
				continue;
			}
			sc.close();
		}
	}
}
