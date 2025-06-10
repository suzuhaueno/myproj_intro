package myproj_intro.ch09;

public class ChangeArrayElement1 {

	public static void main(String[] args) {
		
		//住居年数を管理するための配列変数の宣言と要素の初期化
		int[] kandaMansion = {3, 1, 10};
		
		System.out.println("0号室の住居年数：" + kandaMansion[0]);
		System.out.println("1号室の住居年数：" + kandaMansion[1]);
		System.out.println("2号室の住居年数：" + kandaMansion[2]);
		
		
		//一部の配列の要素に値を代入
		kandaMansion[1] = 2;
		
		System.out.println();
		System.out.println("--変更後の居住年数--");
		
		System.out.println("0号室の住居年数：" + kandaMansion[0]);
		System.out.println("1号室の住居年数：" + kandaMansion[1]);
		System.out.println("2号室の住居年数：" + kandaMansion[2]);

	}

}
