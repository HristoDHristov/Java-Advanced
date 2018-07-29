import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineElements = bfr.readLine().split(" ");
        String[] secondLineElements = bfr.readLine().split("\\s+");

        int n = Integer.parseInt(firstLineElements[0]);
        int s = Integer.parseInt(firstLineElements[1]);
        int x = Integer.parseInt(firstLineElements[2]);
        int minNumber = Integer.MAX_VALUE;

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Integer> minNumbers = new ArrayDeque<>();

        for (int i = 0; i < n ; i++) {
            int currentNumber = Integer.parseInt(secondLineElements[i]);
            numbers.offer(currentNumber);

            if(currentNumber <= minNumber) {
                minNumber = currentNumber;

                minNumbers.offer(currentNumber);
            }
        }

        for (int i = 0; i < s; i++) {
            int number = numbers.poll();

            if(number == minNumber) {
                minNumbers.poll();

                if(minNumbers.size() > 0) {
                    minNumber = minNumbers.peek();
                } else {
                    minNumber = Integer.MAX_VALUE;
                }
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
