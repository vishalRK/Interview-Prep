
public class EvenArr {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

        int a[] = new int[n.length];

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                a[i] = n[i];
            }
            if (a[i] % 2 == 0) {
                System.out.print(a[i]);
            }
            // for (int i = 0; i < a.length; i++) {
            // System.out.print(a[i]);
            // }
        }
    }
}
