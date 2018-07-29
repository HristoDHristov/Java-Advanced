import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineElements = bfr.readLine().split(" ");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (String firstLineElement : firstLineElements) {
            numbers.push(Integer.parseInt(firstLineElement));
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop() + " ");
        }
    }
}
