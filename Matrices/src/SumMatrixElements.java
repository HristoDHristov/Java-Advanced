import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumMatrixElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bfr.readLine().split(", ");

        if(firstLine.length == 2) {
            int sum = 0;
            int rows = Integer.parseInt(firstLine[0]);
            int cols = Integer.parseInt(firstLine[1]);

            int[][] matrix = new int[rows][cols];


            for(int i = 0; i < rows; i++) {
                String[] matrixElements = bfr.readLine().split(", ");

                for(int j = 0; j < cols; j++) {
                    int matrixElement = Integer.parseInt(matrixElements[j]);

                    sum += matrixElement;

                    matrix[i][j] = matrixElement;

                }
            }

            System.out.println(rows);
            System.out.println(cols);
            System.out.println(sum);

        } else {
            throw new IOException("Invalid parameters");
        }
    }
}