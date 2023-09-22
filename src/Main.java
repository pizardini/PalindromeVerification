import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = input();
        System.out.println(output(list));
    }


    public static List<String> input() {
        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as palavras que gostaria de verificar, uma por linha e envie uma linha vazia para terminar.");

        String line;
        while (!(line = sc.nextLine().trim()).isEmpty()) {
            words.add(line);
        }
        return words;
    }

    public static int output(List<String> words) {
    int contador = 0;
    int n = words.size();
        for (int i = 0; i < n; i++) { //modo para cumprir os requisitos do exercício
            String word = words.get(i);
//        for (String word : words) { //modo alternativo de se fazer
            boolean case1 = Palindrome.isPalindrome(word);

            if (case1) {
                contador++;
            }
            else {
                boolean case2 = Palindrome.anagramPalindrome(word);
                if (case2) {
                    contador++;
                }
            }
        }
        return contador;
    }
}