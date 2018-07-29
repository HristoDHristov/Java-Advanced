import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] lineElements = bfr.readLine().split(" ");
        int n = Integer.parseInt(bfr.readLine());

        ArrayDeque<String> players = new ArrayDeque<>();

        Collections.addAll(players, lineElements);

        int index = 1;
        int droppedPlayer = 1;

        while (players.size() > 1) {
            if(index % n == 0) {
                if(!isPrime(droppedPlayer)) {
                    System.out.println("Removed " + players.remove());
                } else {
                    System.out.println("Prime " + players.peek());
                }

                droppedPlayer++;
            } else {
                String nextPlayer = players.remove();
                players.add(nextPlayer);
            }

            index++;
        }

        System.out.println("Last is " + players.remove());
    }

    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
