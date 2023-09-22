import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public List<String> input() {
        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as palavras que gostaria de verificar, uma por linha.");

        String line;
        while (!(line = sc.nextLine().trim()).isEmpty()) {
            words.add(line);
        }
        return words;
    }

    public int output(List<String> words) {

        for (String word : words) {
            Palindrome.isPalindrome(word);
        }
        return 0;
    }
}