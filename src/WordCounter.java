package Assignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);
        int wordCount = st.countTokens();

        System.out.println("Total number of words: " + wordCount);
        sc.close();
    }
}
