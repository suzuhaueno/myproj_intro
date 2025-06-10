package myproj_intro.ch07;

public class NestedLoopWithKuku {

	public static void main(String[] args) {
		
		for (int dan = 1; dan < 10; dan++) {
			
			System.out.print(dan +"の段：");
			
			for (int count = 1; count < 10; count++) {
				System.out.print(dan * count + " ");
			}
			System.out.println();
		}

	}

}
