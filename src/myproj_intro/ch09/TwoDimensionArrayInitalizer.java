package myproj_intro.ch09;

public class TwoDimensionArrayInitalizer {

	public static void main(String[] args) {
		
		//int型の2次元配列の宣言と要素の初期化
		int[][] inArray = {
				{50, 150, 250},
				{300, 200, 100}
		};
		
		for (int i = 0; i < inArray.length; i++) {
			for (int j = 0; j < inArray[i].length; j++) {
				System.out.println("intArray[" + i + "][" + j + "]の値：" + inArray[i][j]);
			}
			System.out.println();
		}

	}

}
