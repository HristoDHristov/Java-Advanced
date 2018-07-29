import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;

public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] expression = bfr.readLine().split(" ");

        ArrayDeque<String> calculator = new ArrayDeque<>();

        for (String e : expression) {
            calculator.add(e);
        }

        while (calculator.size() > 1) {
            int firstDigit = Integer.parseInt(calculator.pop());
            String operator = calculator.pop();
            int secondDigit = Integer.parseInt(calculator.pop());

            int result;

            if(operator.equals("+")) {
                result = firstDigit + secondDigit;
            } else {
                result = firstDigit - secondDigit;
            }

            calculator.push(Integer.toString(result));
        }

        System.out.println(calculator.pop());
    }
}
