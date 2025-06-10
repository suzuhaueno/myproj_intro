package myproj_intro.ch05;

public class NestedIfStatement1 {

	public static void main(String[] args) {
		
		//比較用の値を管理する変数aを宣言し、5で初期化
		int a = 5;
		
		System.out.println("*****if文の判定開始*****");
		
		if (a >= 0) {
			System.out.println("変数aは0以上。");
			if (a <= 10) {
				System.out.println("変数aは10より大きい。");
			} else {
				System.out.println("変数aは10より大きい。");
			}
		}
		
		System.out.println("*****if文の判定終了*****");

	}

}
