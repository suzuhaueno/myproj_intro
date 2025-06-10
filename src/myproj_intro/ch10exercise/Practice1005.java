package myproj_intro.ch10exercise;

public class Practice1005 {

	static double searchMaximum(double[] ary) {
		
		double maxNum = ary[0];
		
		for (int i = 1; i < ary.length; i++) {
			if (maxNum < ary[i]) {
				maxNum = ary[i];
			}
		}
		return maxNum;		
	}
	
	
	public static void main(String[] args) {
		
		double[] random = new double[10];
		
		System.out.println("--ランダムに生成された10個の数値--");
		for (int i = 0; i < 10; i++) {
			random[i] = Math.random();
			System.out.println(random[i]);
		}
		
		System.out.println("--最大値--");
		System.out.println(searchMaximum(random));
	}

}
