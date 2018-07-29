import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class PalindromeChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        boolean isPalindrome = true;
        char[] input = bfr.readLine().toCharArray();
        ArrayDeque<Character> palindrome = new ArrayDeque<>();

        for (char s : input) {
            palindrome.add(s);
        }

        while (palindrome.size() > 1) {
            char firstElement = palindrome.poll();
            char lastElement = palindrome.pollLast();

            if(firstElement != lastElement) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome);
    }
}
