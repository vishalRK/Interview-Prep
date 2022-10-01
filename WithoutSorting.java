public class WithoutSorting {
    public static void main(String[] args) {
        int a[] = { 1, 0, 1, 1, 0, 0, 1, 1, 1 };
        int b[] = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                b[k++] = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
        }
    }
}
