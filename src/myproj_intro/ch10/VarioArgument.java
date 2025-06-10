package myproj_intro.ch10;

public class VarioArgument {

	static void checkPass (String name, int point, int passPoint) {
		 
		System.out.print(name +"は");
		if (point >= passPoint) {
			System.out.println(point + " 点なので合格です。");
		} else {
			System.out.println(point +"点なので不合格です。 ");
		}
		System.out.println(" - - - ");
		
	}
	
	public static void main(String[] args) {
		
		//点数を管理する変数の宣言と初期化
		int pointA = 85;
		int pointB = 32;
		int pointC = 60;
		int pointD = 40;
		
		checkPass("A君",pointA, 50);
		
		checkPass("B君",pointB, 50);
		
		checkPass("C君",pointC, 50);
		
		checkPass("D君",pointD, 50);


	}

}
