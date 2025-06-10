package myproj_intro.ch10exercise;

public class Practice1004 {

	static int[] reverse(int[] num) {
		//ループで配列の要素を交換していく
		for (int i = 0 ; i < ( num.length / 2 ) ; i++) {
			//先頭の要素を一時的に保存
			int hoge = num[i];
			//配列の先頭の要素の位置に対応する、末尾の要素を代入
			//(num.length - 1)は、配列の最後のインデックス
			//(num.length - 1 - i)は、配列の末尾から数えてi番目のインデックス
			num[i] = num[num.length - 1 - i];
			//末尾の要素の位置に、一時的にhogeに保存して置いた先頭側の要素を代入
			num[num.length -1 - i] = hoge;
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int[] number = {1, 3, 5, 7};
		
		System.out.println("--変更前の配列--");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		reverse(number);
		
		System.out.println("--変更後の配列--");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

	}

}
