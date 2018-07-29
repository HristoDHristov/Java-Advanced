import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args)throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bfr.readLine());
        ArrayList<ArrayList> matrix = new ArrayList<ArrayList>(){{
            add(0,
                new ArrayList()
                {{
                    add(1);
                }}
            );
            add(1,
                new ArrayList()
                {{
                    add(1);
                    add(1);
                }}
            );
        }};

        if(n < 2) {
            System.out.println("1");
        } else {
            for (int i = 2; i < n; i++) {
                ArrayList currentRow = new ArrayList(){{ add(1); }};

                for (int j = 1; j < i; j++) {
                    ArrayList prevMatrix = matrix.get(i -1);
                    BigDecimal sum = new BigDecimal(prevMatrix.get(j - 1).toString()).add(new BigDecimal(prevMatrix.get(j).toString()));
                    currentRow.add(sum);
                }

                currentRow.add(1);
                matrix.add(i, currentRow);
            }

            for (ArrayList arrayList : matrix) {
                for (Object o : arrayList) {
                    System.out.print(o + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
