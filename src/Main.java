import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arsen on 2019
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //we save int
        outer:
        for (int number = 0; number <1000; number++) {
            int[] frequency = new int[10];
            int k = number;
            while (k>0) {
                int d = k % 10;
                if (frequency[d] > 0) {
                    continue outer;
                }
                frequency[d]++;
                k/=10;
            }
            list.add(number);
        }

        int count = 0;
        for (int n : list) {
            System.out.printf("%4d", n);// how many digit before point
            if (++count % 10 == 0) {
                System.out.println();
            }
        }
    }

}
