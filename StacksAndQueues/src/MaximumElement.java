import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int commandsNumber = Integer.parseInt(bfr.readLine());
        int maxNumber = Integer.MIN_VALUE;

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Integer> maxNumbers = new ArrayDeque<>();

        for (int i = 0; i < commandsNumber; i++) {
            String[] line = bfr.readLine().split("\\s+");

            String command = line[0];

            switch (command) {
                case "1":
                    int number = Integer.parseInt(line[1]);

                    numbers.push(number);
                    if(number >= maxNumber) {
                        maxNumber = number;
                        maxNumbers.push(number);
                    }

                    break;
                case "2":
                    int lastElement = numbers.pop();

                    if(lastElement == maxNumber) {
                        maxNumbers.pop();

                        if(maxNumbers.size() > 0) {
                            maxNumber = maxNumbers.peek();
                        } else {
                            maxNumber = Integer.MIN_VALUE;
                        }
                    }

                    break;
                case "3":
                    System.out.println(maxNumber);
                    break;
                default: throw new IOException("Invalid Command");
            }
        }
    }
}
