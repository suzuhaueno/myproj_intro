package myproj_intro.ch07exercise;

public class Practice0703 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 40; i++) {
			if (i % 2 == 1) {
				continue;
			} else if (i > 21) {
				break;
			} else {
				System.out.println(i);
			}
		}

	}

}
