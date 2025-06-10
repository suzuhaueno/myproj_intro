package myproj_intro.kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name;
	private int japanese;
	private int math;
	private int english;
	
	//コンストラクタ
	public  Student (String name, int japanese, int math, int english){
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}
	
	//名前を取得するメソッド
	public String getName() {
		return name;
	}
	
	//国語の点数を取得するメソッド
	public int getJapanese() {
		return this.japanese;
	}
	
	//数学の点数を取得するメソッド
	public int getMath() {
		return this.math;
	}
	
	//英語の点数を取得するメソッド
	public int getEnglish () {
		return this.english;
	}
	
	//3科目の合計点を計算して返すメソッド
	public  int scoreTotal () {
		return  this.japanese + this.math + this.english;
	}
	
	//3教科の平均点を計算して返すメソッド
	public  double ave() {
		int currentSum = scoreTotal();
		return  (double) currentSum / 3.0;
	}
	
	//生徒の名前と各科目の点数、合計点、平均点を形成して表示するメソッド
	public  void diaplayStudentInfo() {
		System.out.println("名前：" + this.name);
		System.out.println("国語：" + this.japanese);
		System.out.println("数学：" + this.math);
		System.out.println("英語：" + this.english);
		
		int currentSum = scoreTotal();
		double currentAve = ave();
		System.out.println("合計点：" + currentSum);
		System.out.println("平均点：" + currentAve);
		System.out.println();
	}
	
	//数字出ない場合のエラーチェック
	public static int getValueInput(Scanner scanner, String message) {
		int number;
		while (true) {
			System.out.print(message);
			String line = scanner.nextLine();
			try {
				number = Integer.parseInt(line);
				if (number < 0 || number > 100) {
					System.out.println("1から100の数字を入力してください。");
				} else {
					return number;
				}
			} catch (NumberFormatException e) {
				System.out.println("エラー：有効な数字を入力してください。");
				continue;
			}
		}
	}
	
	//名前が空白の場合のエラーチェック
	public static String nameCheck(Scanner scanner, String message) {
		while (true) {
			System.out.print(message);
			String name = scanner.nextLine();
				if (name.equals("")) {
					System.out.println("エラー：名前を入力してください。");
				} else {
					return name;
				}
		}
	}
	//登録生徒人数のエラーチェック
	public static int numberCheck(Scanner scanner, String message) {
		int number;
		while (true) {
			System.out.print(message);
			String num = scanner.nextLine();
			try {
				number = Integer.parseInt(num);
				if (number <= 0 || number >= 50) {
					System.out.println("エラー:1から50までの数字を入力してください。");
				} else {
					return number;
				}
			} catch(NumberFormatException e) {
				System.out.println("エラー：有効な数字を入力してください。");
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		
		int number = numberCheck(sin, "登録する生徒の人数を入力してください：");
		
		System.out.println();
		
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) +"人目の生徒情報を入力してください。");
			String name = nameCheck(sin, "名前：");
			int japanese = getValueInput(sin, "国語の点数：");
			int math = getValueInput(sin, "数学の点数：");
			int english = getValueInput(sin, "英語の点数：");

			System.out.println();
			
			//Studentインスタンスを作成
			Student s = new Student(name, japanese, math, english);
			studentList.add(s);
			
		}
		System.out.println("--- 生徒情報一覧 ---");
		for (Student s : studentList) {
			s.diaplayStudentInfo();
		}
	
		sin.close();
	}

}
