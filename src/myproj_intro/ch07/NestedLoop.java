package myproj_intro.ch07;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			
			System.out.println("外側ループ"+ i +"回目");
			
			for (int j= 1; j <= 2; j++) {
				
				System.out.println("内側ループ"+ j +"回目");
				
			}
			System.out.println();
		}
	}

}
