import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BasicStackOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bfr.readLine().split(" ");
        String[] secondLine = bfr.readLine().split("\\s+");

        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);
        int minNumber = Integer.MAX_VALUE;

        Deque<Integer> numbers = new ArrayDeque<>();
        Deque<Integer> minNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(secondLine[i]);

            numbers.push(currentNumber);

            if(minNumber >= currentNumber) {
                minNumber = currentNumber;
                minNumbers.push(currentNumber);
            }
        }

        for (int i = 0; i < s; i++) {
            int number = numbers.pop();

            if(number == minNumber) {
                minNumbers.pop();
                minNumber = minNumbers.peek();
            }
        }

        if(numbers.isEmpty()) {
            System.out.println(0);
        } else if(numbers.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(minNumber);
        }
    }
}
