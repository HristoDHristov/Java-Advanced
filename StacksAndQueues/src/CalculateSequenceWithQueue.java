import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class CalculateSequenceWithQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bfr.readLine());

        ArrayDeque<Long> sequence = new ArrayDeque<Long>(){{
            offer(n);
        }};

        ArrayDeque<Long> first17Sequences = new ArrayDeque<Long>(){{
            offer(n);
        }};

        while (sequence.size() < 50) {
                long nextSequence = first17Sequences.poll();
                long formula1 = nextSequence + 1;
                long formula2 = 2 * nextSequence + 1;
                long formula3 = nextSequence + 2;

                if(sequence.size() < 17) {
                    first17Sequences.offer(formula1);
                    first17Sequences.offer(formula2);
                    first17Sequences.offer(formula3);
                }

                sequence.offer(formula1);
                sequence.offer(formula2);
                sequence.offer(formula3);
        }

        while (!sequence.isEmpty()) {
            System.out.print(sequence.poll() + " ");
        }
    }
}
