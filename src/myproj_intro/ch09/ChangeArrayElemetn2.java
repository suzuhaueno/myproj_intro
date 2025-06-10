package myproj_intro.ch09;

public class ChangeArrayElemetn2 {

	public static void main(String[] args) {
		
		//飲み物の価格を管理する配列kandaPriceの宣言と要素の初期化
		int[] kandaPrice = {100, 200, 300};
		
		//飲み物の価格を管理する配列akibaPriceを宣言し、配列kandaPriceで初期化
		int[] akibaPrice = kandaPrice;
		
		System.out.println("---神田店---");
		System.out.println("お茶　　：" + kandaPrice[0]);
		System.out.println("紅茶　　：" + kandaPrice[1]);
		System.out.println("コーヒー：" + kandaPrice[2]);
		
		System.out.println("---秋葉原店---");
		System.out.println("お茶　　：" + akibaPrice[0]);
		System.out.println("紅茶　　：" + akibaPrice[1]);
		System.out.println("コーヒー：" + akibaPrice[2]);
		
		System.out.println();
		System.out.println("※価格改定後");
		
		//秋葉店の紅茶の価格を変更
		akibaPrice[1] = 240;
		
		System.out.println("---神田店---");
		System.out.println("お茶　　：" + kandaPrice[0]);
		System.out.println("紅茶　　：" + kandaPrice[1]);
		System.out.println("コーヒー：" + kandaPrice[2]);
		
		System.out.println("---秋葉原店---");
		System.out.println("お茶　　：" + akibaPrice[0]);
		System.out.println("紅茶　　：" + akibaPrice[1]);
		System.out.println("コーヒー：" + akibaPrice[2]);

	}

}
