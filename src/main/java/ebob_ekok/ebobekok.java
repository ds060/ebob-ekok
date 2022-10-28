package ebob_ekok;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz:");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz:");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok = 0;
        int max = n1 * n2;

        for (int i = max; i > 0; i--) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
            }
        }
        System.out.println("ekok:" + ekok);

        for (int i = 1; i < n1; i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
        }
        System.out.println("ebob:"+ebob);


    }
}

