package myproj_intro.ch05;

import java.util.Scanner;

public class Practice0505 {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in);
		System.out.print("身長を入力してください(m) > ");
		double height = sin.nextDouble();
		
		System.out.print("体重を入力してください(kg)  >");
		double weight = sin.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("あなたのBMI値は、"+ (int)bmi +"です。");
		
	}

}
