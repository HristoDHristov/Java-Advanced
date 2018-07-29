import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class RecursiveFibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bfr.readLine());

        System.out.println(getFibonacci(n));
    }

    private static int getFibonacci(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);

    }
}
