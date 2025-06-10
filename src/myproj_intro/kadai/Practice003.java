package myproj_intro.kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice003 {
	private String number;
	private String name;
	private int restMoney;
	
	//コンストラクタ
	public Practice003 (String number, String name, int restmoney){
		this.number = number;
		this.name = name;
		this.restMoney = restmoney;
	}
	
	//口座番号を取得
	public String getNumber() {
		return this.number;
	}
	//口座名義人を取得
	public String getName() {
		return this.name;
	}
	//残高を取得する
	public int getMoney () {
		return this.restMoney;
	}
	//入金する
	public void inMoney (int money) {
		if (money < 0) {
			System.out.println("エラー：入金金額がマイナスになっています。");
		}
		//合計金額の算出
		this.restMoney += money;
	}
	//出金する
	public boolean outMoney (int money) {
		if (money < 0) {
			System.out.println("エラー：出金金額がマイナスになっています。");
			return false;
		} else if (this.restMoney < money) {
			System.out.println("エラー：出金金額が残高を超えています。");
			return false;
		}
		this.restMoney -= money;
		System.out.println("現在の残高" + restMoney + "円");
		return true;
		
	}
	//口座情報を整形して表示
	public void showInfo () {
		System.out.println("-----------------------------------------");
		System.out.println("口座番号：" + this.number);
		System.out.println("口座名義：" + this.name);
		System.out.println("残高：" + this.restMoney + "円");
		System.out.println("------------------------------------------");
	}
	
		public static void main(String[] args) {
			
			Scanner sin = new Scanner(System.in);
			int acountNumber = 0;
			String number = "";
			String name = "";
			int restMoney = 0;
			ArrayList<Practice003> acountList = new ArrayList<Practice003>();
			
			//口座の登録数を入力
			System.out.println("何件の口座を登録しますか？");
			acountNumber = sin.nextInt();
			
			for (int i = 0; i < acountNumber; i++) {
				System.out.println((i + 1) + "件目の講座情報を入力してください。");
				System.out.print("口座番号：");
				number = sin.nextLine();
				System.out.print("口座名義：");
				name = sin.nextLine();
				System.out.print("初期残高：");
				restMoney = sin.nextInt();
				
				Practice003 showList = new Practice003(number, name, restMoney);
				acountList.add(showList);
			}
			
			for (Practice003 showList : acountList) {
				showList.showInfo();
			}

	}

}
