import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSum {
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bfr.readLine().split(", ");

        if(firstLine.length == 2) {
            int row = Integer.parseInt(firstLine[0]);
            int col = Integer.parseInt(firstLine[1]);
            int maxSum = Integer.MIN_VALUE;
            int rowMaxValue = 0;
            int colMaxValue = 0;

            int[][] matrix = new int[row][col];

            for (int i = 0; i < row; i++) {
                String[] rowElements = bfr.readLine().split(", ");

                for (int j = 0; j < col; j++) {
                    matrix[i][j] = Integer.parseInt(rowElements[j]);
                }
            }

            for (int i = 0; i < row - 1; i++) {
                for (int j = 0; j < col - 1; j++) {
                    int sum = matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1][j + 1];

                    if(sum > maxSum) {
                        rowMaxValue = i;
                        colMaxValue = j;
                        maxSum = sum;
                    }
                }
            }

            System.out.println(matrix[rowMaxValue][colMaxValue] + " " + matrix[rowMaxValue][colMaxValue + 1]);
            System.out.println(matrix[rowMaxValue + 1][colMaxValue] + " " + matrix[rowMaxValue + 1][colMaxValue + 1]);
            System.out.println(maxSum);
        } else {
            throw new IOException("invalid input parameters");
        }

    }
}
