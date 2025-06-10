package myproj_intro.ch10exercise;

import java.util.Scanner;

public class Practice1003 {
	
	static void outSing() {
		System.out.print("* ");
	}

	static void dispLine(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				outSing();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("正方形の1辺を入力-->");
		int base = sc.nextInt();
		
		dispLine (base);
		
	}

}
