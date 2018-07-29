import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class ReverseStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String inputString = bfr.readLine();

        ArrayDeque<Character> reverseString = new ArrayDeque<>();

        for (char c : inputString.toCharArray()) {
            reverseString.push(c);
        }

        while (!reverseString.isEmpty()) {
            System.out.print(reverseString.pop());
        }
    }
}
