package myproj_intro.kadai; 

import java.util.Scanner;

public class Practice001 {

    // 数字の入力チェック
	//文字列を数値として解釈できるか判定する
    static boolean isNumeric(String str) {
        //空文字やnullのとき数値でではないのでfalseを返す
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            //文字列を整数に変換
            Integer.parseInt(str);
            //変換出来たらtrueを返す
            return true;
            //NumberFormatExceptionは、文字列を数値に変換したとき
            //その文字列が数値にならないときに発生するエラー
        } catch (NumberFormatException e) {
            //変換できなければ数字ではない
            return false;
        }
    }
    
    // 数字が入力されるまで繰り返し入力を求める
    //入力された文字列と入力を促すメッセージを仮引数にする
    public static int getNumericInput(Scanner scanner, String promptMessage) {
        String inputText;
        int number = 0;
        //有効な入力が得られたかどうかのフラグ
        boolean isValid = false;
        //isValidがfaiseの間ループを続ける
        while (!isValid) {
            System.out.print(promptMessage);
            inputText = scanner.nextLine();
            //ifの中がtrueだったときにその下の処理ができる
            //数値にできたときtrueが返ってくる
            if (isNumeric(inputText)) {
                number = Integer.parseInt(inputText);
                isValid = true; // 数字ならループを抜ける
            } else {
                System.out.println("エラー：数字を入力してください。");
                //isValidはfalseのままなのでループ継続
            }
        }
        //文字列を数値に変更したものを返す
        return number;
    }
    
    //数字が0以上かどうかの入力チェック
    public static int getPositiveNumericInput(Scanner scanner, String promptMessage) {
        int number = 0;
        boolean isValid = false;
        while(!isValid) {
            number = getNumericInput(scanner, promptMessage); 
            if (number >= 0) {
                isValid = true;
            } else {
                System.out.println("エラー：0以上の数字を入力してください。");
                //isValidはfalseのままなのでループ継続
            }
        }
        //文字列を数値に変更したものを返す
        return number;
    }


    // 年齢判定
    static void checkAge(int ageValue) { 
        if (ageValue >= 20) {
            System.out.println("成人です。");
        } else if (ageValue < 0) {
            System.out.println("エラー：年齢は0以上で入力してください。");
        }
        else {
            System.out.println("未成年です。");
        }
    }

    // 四則演算メソッド
    static void Numbers(int num1, int num2) { // 引数名を変更
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        //除算の時は、num2が0のとき計算不可
        if (num2 == 0) {
            System.out.println(num1 + " / " + num2 + " = 0で割ることはできません。");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
        }
    }

    // 九九表の表示
    static void kukuTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                //%3dは、3桁分の幅で右詰めで整数を表示
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
    }

    // テストの合計点と平均点を計算・表示する
    static void testScores(String[] scoreTexts, int count) {
        int sum = 0;
        double ave = 0;

        //for ( : ) = 拡張for文 = 配列を最初から最後まで順番に1つずつ取り出して処理する
        //String scre = 配列から取り出される要素を格納する変数を宣言
        //scoreTexts = テストの点数が文字列として格納されている配列
        for (String scoreText : scoreTexts) {
        	//数値かどうかの判別isNumeric関数に配列を渡してtrueが返ってきた場合、ifブロック内の処理が実行
            if (isNumeric(scoreText)) {
            	//int型の数字にする
                int score = Integer.parseInt(scoreText);
                if (score >= 0 && score <= 100) { // 点数が0〜100の範囲内かチェック (任意)
                    sum += score;
                } else {
                    System.out.println("注意: '" + scoreText + "' は0から100の間の値でないため集計しません。。");
                }
            } else {
                System.out.println("注意: '" + scoreText + "' は数字ではないため集計しません。");
            }
        }

        if (count > 0) {
            ave = (double) sum / count;
            System.out.println("合計点：" + sum);
            System.out.println("平均点：" + ave);
        }
    }


   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "うえの";
        String hobby = "バンド";
        int intAge = 22; 

        System.out.println("名前：" + name + "\n趣味：" + hobby + "\n年齢：" + intAge);
        System.out.println();

        // 年齢入力
        //getPositiveNumbericInputで、0以上の整数が入力されるまで繰り返す
        int Age = getPositiveNumericInput(sc, "年齢を入力してください。-->");
        checkAge(Age);

        System.out.println();

        // 整数1と整数2の入力
        System.out.println("四則演");
        int inputNum1 = getNumericInput(sc, "整数1を入力してください。-->");
        int inputNum2 = getNumericInput(sc, "整数2を入力してください 。-->");
        Numbers(inputNum1, inputNum2);

        System.out.println();
        System.out.println("九九表の表示");
        kukuTable(); // 引数なしで呼び出し

        System.out.println();
        System.out.println("テストの点数");
        int countNumber = 5;
        
        String[] testScoresText = new String[countNumber];
        for (int i = 0; i < countNumber; i++) {
            boolean isValidScoreInput = false;
            while(!isValidScoreInput) {
                System.out.print((i + 1) + "人目のテストの点数を入力してください。-->");
                String scoreInput = sc.nextLine();
                if (isNumeric(scoreInput)) {
                  
                    testScoresText[i] = scoreInput; // とりあえず数字ならOKとする
                    isValidScoreInput = true;
                } else {
                     System.out.println("エラー: 数字で点数を入力してください。");
                }
            }
        }
        testScores(testScoresText, countNumber);

        //Scannerを閉じる
        sc.close();
        System.out.println("\nプログラムを終了します。");
    }
}