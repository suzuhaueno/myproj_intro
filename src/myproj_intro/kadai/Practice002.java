package myproj_intro.kadai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 英文入力
        String sentence = getInputSentence(scanner);

        // 2. 単語リストの作成と正規化
        //    (getWordList の中で normalizeWord が使われる)
        ArrayList<String> wordList = getWordList(sentence);

        // 3. 単語の出現回数カウント
        HashMap<String, Integer> wordCounts = countWordOccurrences(wordList);

        // 4. 全単語の出現回数表示
        displayAllWordCounts(wordCounts);

        // 5. 特定の単語の検索
        //    (ユーザーが 'q' を入力するまでループ)
        searchSpecificWord(scanner, wordCounts);

        scanner.close(); // Scannerを閉じる
    }

    /**
     * ユーザーから英文の入力を受け付けて、その文字列を返すメソッド。
     */
    public static String getInputSentence(Scanner scanner) {
        System.out.print("英文を入力してください：");
        return scanner.nextLine();
    }

    /**
     * 1つの単語を受け取り、小文字化と末尾の句読点除去の処理を行って、正規化された単語を返すメソッド。
     */
    public static String normalizeWord(String rawWord) {
        if (rawWord == null || rawWord.isEmpty()) {
            return "";
        }
        // 小文字に変換
        String lowerCaseWord = rawWord.toLowerCase();
        // 末尾の句読点（ピリオド, カンマ, 疑問符, 感嘆符）を除去
        String cleanedWord = lowerCaseWord.replaceAll("[.,?!]$", "");
        return cleanedWord;
    }

    /**
     * getInputSentence で得た文章と normalizeWord を利用して、
     * 正規化された単語のリスト (ArrayList<String>) を作成して返すメソッド。
     */
    public static ArrayList<String> getWordList(String sentence) {
        ArrayList<String> wordList = new ArrayList<>();
        if (sentence == null || sentence.isEmpty()) {
            return wordList;
        }

        // 単語の区切りはスペースとする (1つ以上の連続した空白文字で分割)
        String[] rawWords = sentence.split("\\s+");

        for (String rawWord : rawWords) {
            String normalizedWord = normalizeWord(rawWord);
            // 処理の結果、空文字列になった単語は無視する
            if (!normalizedWord.isEmpty()) {
                wordList.add(normalizedWord);
            }
        }
        return wordList;
    }

    /**
     * 単語リストを受け取り、各単語の出現回数を数えて HashMap<String, Integer> として返すメソッド。
     */
    public static HashMap<String, Integer> countWordOccurrences(ArrayList<String> wordList) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        if (wordList == null) {
            return wordCounts;
        }

        for (String word : wordList) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    /**
     * 単語の出現回数が格納された HashMap を受け取り、整形してコンソールに表示するメソッド。
     */
    public static void displayAllWordCounts(HashMap<String, Integer> wordCounts) {
        System.out.println("\n--- 各単語の出現回数 ---");
        if (wordCounts == null || wordCounts.isEmpty()) {
            System.out.println("カウントされた単語はありません。");
            return;
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * ユーザーに検索したい単語を入力させ、その出現回数を表示する処理を、
     * ユーザーが終了を選ぶまで繰り返すメソッド。
     */
    public static void searchSpecificWord(Scanner scanner, HashMap<String, Integer> wordCounts) {
        if (wordCounts == null) {
            System.out.println("\n検索対象の単語データがありません。");
            return;
        }
        
        while (true) {
            System.out.print("\n検索したい単語を入力してください (終了する場合は 'q' と入力): ");
            String searchTermInput = scanner.nextLine();

            if (searchTermInput.equalsIgnoreCase("q")) {
                System.out.println("プログラムを終了します。"); // 終了メッセージをこちらで表示
                break; 
            }

            String searchTerm = searchTermInput.toLowerCase();

            if (wordCounts.containsKey(searchTerm)) {
                System.out.println("「" + searchTermInput + "」の出現回数は " + wordCounts.get(searchTerm) + " 回です。");
            } else {
                System.out.println("「" + searchTermInput + "」は見つかりませんでした。");
            }
        }
    }
}