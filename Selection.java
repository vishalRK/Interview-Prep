public class Selection {
    public static void main(String[] args) {
        int a[] = { 3, 2, 12, 1, 4, 7, 6, 9, 8, 11, 10 };
        System.out.println("");
        System.out.print("After Sorting using Selection Sort : ");
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                // this logic for selection sort in ascending order
                if (a[j] < a[min]) {
                    min = j;
                }
                // this logic for selection sort in descending order
                /*
                 * if(a[j] > a[min]) {
                 * min = j;
                 * }
                 */
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
