
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.io.IOException;

    public class Task7 {
        public static void main(String[] s) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int MAXvalue = Integer.parseInt(reader.readLine());
            for (int i = 0; i < MAXvalue; i++) {
                if ((i%2 != 0 || i == 2) && (i%3 != 0 || i == 3) && (i%5 != 0 || i == 5) && (i%7 != 0 || i == 7)) {
                    System.out.println(i);
                }
            }
        }
    }