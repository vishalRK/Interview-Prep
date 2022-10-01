public class Insertion {
    public static void main(String[] args) {
        int a[] = { 8, 4, 6, 1, 2, 3 };

        System.out.println("**************************************");
        System.out.print("\n sort the array usiing Insertion Sort: ");

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("********************************************");
    }
}
