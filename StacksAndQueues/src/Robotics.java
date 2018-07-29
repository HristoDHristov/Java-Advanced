import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;

public class Robotics {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] firsLine = bfr.readLine().split(";");

        if(firsLine.length > 0) {
            String startTime = bfr.readLine();
            DateFormat sdf = new SimpleDateFormat("hh:mm:ss");

            ArrayDeque<String> robots = new ArrayDeque<>();

            Collections.addAll(robots, firsLine);

            Date processTime = sdf.parse(startTime);

            boolean isEnd = false;

            System.out.println();

            String[] robotInfo = {};
            while (!isEnd) {
                String product = bfr.readLine();

                if(!product.equals("End")) {
                    if(!robots.isEmpty()) {
                        robotInfo = robots.poll().split("-");
                        processTime.setTime(processTime.getTime() + (1 * 1000));
                    } else {

                        processTime.setTime(processTime.getTime() + (Integer.parseInt(robotInfo[1]) * 1000));
                    }

                    String robotName = robotInfo[0];

                    System.out.printf("%s - %s [%s]\n", robotName, product, sdf.format(processTime));
                } else {
                    isEnd = true;
                }
            }
        }

    }
}
