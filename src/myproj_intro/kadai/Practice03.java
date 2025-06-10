package myproj_intro.kadai;
import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		String subject = "";
		int score = 0;
		
		while (true) {
			System.out.println("教科を入力してください。");
			subject = sin.nextLine();
			
			while(true) {
				
				score = getValueInput(sin, "点数を入力してください。");
				if (score > 100 && score < 0) {
					System.out.println("正しい点数を入力してください。");
					continue;
				}
				// 評価取得
				scoreGread(score, subject);
				break;
			}
			sin.nextLine();
			
			System.out.println("アプリを終了しますか。(y / n)");
			String  end = sin.nextLine();
			if (end.equals("y")) {
				System.out.println("アプリを終了しました。");
				System.exit(0);
			} else {
				continue;
			}
		}
		
	}

	
	//正しい値が入っているかのチェック
		public static int getValueInput(Scanner scanner, String message) {
			int number = 0;
			while (true) {
				//入力メッセージを表示
				System.out.println(message);
				String line = scanner.nextLine();
				try {
					number = Integer.parseInt(line);
					if (number < 0) {
						System.out.println("0以上を入力してください。");
					} else {
						return number;
					}
				//数字以外が入力された例外処理
				} catch (NumberFormatException e) {
					System.out.println("エラー：有効な整数を入力してください。");
					continue;
				}
			}
		}
		//評価の表示
		public static void scoreGread (int score, String subject) {
			
			if (90 <= score && score<= 100) {
				System.out.println("あなたの" + subject +"の評価はAです。");
			} else if (score >= 80 && score < 90) {
				System.out.println("あなたの"+ subject +"の評価はBです。");
			} else if (score >= 70 && score < 80) {
				System.out.println("あなたの" + subject +"の評価はCです。");
			} else if (score >= 60 && score < 70) {
				System.out.println("あなたの" + subject +"の評価はDです。");
			} else if (score <= 50){
				System.out.println("あなたの" + subject +"の評価はEです。");
			} else {
				System.out.println("点数は1から100で入力してください。");
			}
		}
}
