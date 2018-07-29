import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String expression = bfr.readLine();

        ArrayDeque<Integer> bracketPosition = new ArrayDeque<>();

        int index = 0;

        for (char ch : expression.toCharArray()) {
            if(ch == '(') {
                bracketPosition.push(index);
            } else if(ch == ')') {
                int startIndex = bracketPosition.pop();

                System.out.println(expression.substring(startIndex, index + 1));
            }

            index++;
        }
    }
}
