import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class HotPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] lineElements = bfr.readLine().split(" ");
        int n = Integer.parseInt(bfr.readLine());

        ArrayDeque<String> players = new ArrayDeque<>();

        Collections.addAll(players, lineElements);

        int index = 1;

        while (players.size() > 1) {
            String nextPlayer = players.remove();

            if(index % n == 0) {
                System.out.println("Removed " + nextPlayer);
            } else {
                players.add(nextPlayer);
            }

            index++;
        }

        System.out.println("Last is " + players.remove());
    }
}
