package myproj_intro.ch07;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		
		//whileとdo-whileを制御するための変数
		int j = 6;
		
		System.out.println("--最初から条件に合わない場合(while文)--");
		
		while (j <= 5) {
			System.out.println("HelloWhileLoop!");
			j++;
		}
		System.out.println();
		System.out.println("--最初から条件に合わない場合(do-while文)--");
		
		do {
			System.out.println("HelooDoWhileLoop!");
		} while(j <= 5);
	}

}
