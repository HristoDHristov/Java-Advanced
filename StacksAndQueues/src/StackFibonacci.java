import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class StackFibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bfr.readLine());
        ArrayDeque<Integer> fibonacciSequence = new ArrayDeque<Integer>(){{
            push(1);
            push(1);
        }};

        for (int i = 3; i <= n; i++) {
            int last = fibonacciSequence.pop();
            int prev = fibonacciSequence.peek();

            fibonacciSequence.push(last);
            fibonacciSequence.push(last + prev);
        }

        System.out.println(fibonacciSequence.pop() + fibonacciSequence.pop());
    }
}
