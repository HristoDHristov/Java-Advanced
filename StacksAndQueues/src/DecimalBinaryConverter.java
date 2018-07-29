import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DecimalBinaryConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int digit = Integer.parseInt(bfr.readLine());

        if(digit == 0) {
            System.out.println(0);
        } else {
            ArrayDeque<Integer> hexCode = new ArrayDeque<>();

            while (digit != 0) {
                hexCode.push(digit % 2);
                digit /= 2;
            }

            for (int num : hexCode) {
                System.out.print(num);
            }
        }
    }
}
