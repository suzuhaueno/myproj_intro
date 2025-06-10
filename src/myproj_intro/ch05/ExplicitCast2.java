package myproj_intro.ch05;

public class ExplicitCast2 {

	public static void main(String[] args) {
		
		//計算用の値を管理する変数を宣言し、値を代入
		double d = 3.4;
		int i = 2;
		
		System.out.print("d = ");
		System.out.println(d);
		
		System.out.print("i = ");
		System.out.println(i);
		
		double doubleAnswer = d * i;
		System.out.print("d * i :");
		System.out.println(doubleAnswer);
		
		int intAnswer = (int) (d * i);
		System.out.print("(int)(d * i):");
		System.out.println(intAnswer);
		
		double wrongDoubleAnswer = (double) 3 / 2;
		System.out.print("(double)3 / 2 :");
		System.out.println(wrongDoubleAnswer);
	}

}
