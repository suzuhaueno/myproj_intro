package myproj_intro.ch09;

public class AssignValueIntoArray {

	public static void main(String[] args) {
		
		//住居年数を管理するための配列変数の宣言と要素の作成
		int[] kandaMansion = new int[3];
		
		//要素の初期化
		kandaMansion[0] = 3;
		kandaMansion[1] = 1;
		kandaMansion[2] = 10;
		
		System.out.println("0号室の住居年数：" + kandaMansion[0]);
		System.out.println("1号室の住居年数：" + kandaMansion[1]);
		System.out.println("2号室の住居年数：" + kandaMansion[2]);
		

	}

}
