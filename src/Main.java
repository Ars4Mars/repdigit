import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Arsen on 2019
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите число:");
        int digit1 = 0;
        if (scanner.hasNextInt()) {
            digit1 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия

        }

        List<Integer> list = new ArrayList<>(); //we save int
        outer:
        for (int number = 0; number <digit1; number++) {
            int[] frequency = new int[100];
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

        int size = list.size();

        System.out.println(size);

//        int count = 0;
//        for (int n : list) {
//            System.out.printf(" %4d", n);// how many digit before point
//            if (++count % 10 == 0) {
//                System.out.println("  ");
//            }
//        }
    }

}
