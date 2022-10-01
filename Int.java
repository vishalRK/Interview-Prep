import java.util.Scanner;
import java.util.*;

public class Int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Array Size : = ");
        int n = sc.nextInt();

        // FOR integer number
        /*
         * int a[] = new int[n];
         * 
         * for (int i = 0; i < a.length; i++) {
         * a[i] = sc.nextInt();
         * 
         * }
         * 
         * for (int i = 0; i < a.length; i++) {
         * System.out.println(a[i]);
         * }
         */

        // For Character

        char a[] = new char[n];

        a = sc.next().toCharArray();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}
