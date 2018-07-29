import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bfr.readLine().split(" ");

        if(input.length == 2) {
            System.out.printf("Area = %.2f",
                    calculateTriangleArea(
                            Double.parseDouble(input[0]),
                            Double.parseDouble(input[1])
                    )
            );
        } else {
            throw new IOException("invalid input parameters");
        }
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * (base * height);
    }
}
