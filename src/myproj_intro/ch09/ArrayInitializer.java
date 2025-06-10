package myproj_intro.ch09;

public class ArrayInitializer {

	public static void main(String[] args) {
		
		//　住居年数を管理するための変数宣言と要素の作成
		int[]  kandaMansion1 = new int[3];
		
		//要素の初期化
		kandaMansion1[0] = 3;
		kandaMansion1[1] = 1;
		kandaMansion1[2] = 10;
		
		System.out.println("-神田マンション1号棟の移住年数-");
		System.out.println("0号室：" + kandaMansion1[0]);
		System.out.println("1号室：" + kandaMansion1[1]);
		System.out.println("2号室：" + kandaMansion1[2]);
		
		System.out.println();
		
		//住居年数を管理するための配列変数の宣言と要素の初期化
		int[] kandaMansion2 = {3, 1, 10};
		
		System.out.println("-神田マンション1号棟の移住年数-");
		System.out.println("0号室：" + kandaMansion1[0]);
		System.out.println("1号室：" + kandaMansion1[1]);
		System.out.println("2号室：" + kandaMansion1[2]);
	}

}
