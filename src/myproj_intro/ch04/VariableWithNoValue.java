package myproj_intro.ch04;

public class VariableWithNoValue {

	public static void main(String[] args) {
		
		//名前を管理する変数
		String name;
		name = "神田タロー";
		
		//身長を管理する変数
		double height;
		height = 167.9;
		
		//年齢を管理する変数
		int age;
		age = 25;
		
		//血液型を管理する変数
		char blood;
		blood = 'A';
		
		//体重を管理する変数
		double weight;
		weight = 50.6;
		
		System.out.print(name);
		System.out.print("さんの身長は、");
		System.out.print(height);
		System.out.println("cmです。");
		
		System.out.print("年齢は");
		System.out.print(age);
		System.out.println("歳です。");
		
		System.out.print("血液型は");
		System.out.print(blood);
		System.out.println("です。");
		
		System.out.print("体重は");
		System.out.print(weight);
		System.out.println("です。");
		
	}

}
