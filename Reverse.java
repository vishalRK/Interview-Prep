/* write a Programm to reverse the array */
public class Reverse {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };

        int good = 0;
        int bad = 0;
        int differ = 0;
        /* This logic for displaying array values */
        // for (int i = a.length - 1; i >= 0; i--) {
        // System.out.println(a[i]);

        // }
        // System.out.println(a[0]);

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - i - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
