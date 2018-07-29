import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Encrypt {
    private static ArrayList<Character> wowel = new ArrayList<Character>(){{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bfr.readLine());

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = bfr.readLine();
        }

        int[] result = encrypt(names);

        Arrays.sort(result);

        for (int i : result) {
            System.out.println(i);
        }

    }

    public static int[] encrypt(String[] names) {
        int[] encrypt = new int[names.length];

        for (int nIndex = 0; nIndex < names.length; nIndex++) {
            int sum = 0;
            int nameLength = names[nIndex].length();

            for (int i = 0; i < nameLength; i++) {
                char nameChar = names[nIndex].charAt(i);

                if(wowel.contains(Character.toLowerCase(nameChar))) {
                    sum += ((int)(nameChar)) * nameLength;
                } else {
                    sum += ((int)(nameChar)) / nameLength;
                }
            }

            encrypt[nIndex] = sum;
        }

        return encrypt;
    }
}
