import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class BalancedParentheses {
    private static final ArrayList<Character> openingBrackets = new ArrayList<Character>(){{
            add('{');
            add('[');
            add('(');
    }};

    private static final ArrayList<Character> closingBrackets = new ArrayList<Character>(){{
            add('}');
            add(']');
            add(')');
    }};


    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String line = bfr.readLine();
        ArrayDeque<Character> brackets = new ArrayDeque<>();

        boolean isBalanced = true;

        for (char bracket : line.toCharArray()) {
            if(openingBrackets.contains(bracket)) {
                brackets.push(bracket);
            } else {
                if(openingBrackets.indexOf(brackets.pop()) != closingBrackets.indexOf(bracket)) {
                    isBalanced = false;
                }

            }
        }

        System.out.println(isBalanced ? "YES" : "NO");

    }
}
