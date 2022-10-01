public class Binary {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

        int search = 12;
        int li = 0;
        int hi = a.length - 1;
        int mid = (li + hi) / 2;
        while (a[li] < a[hi]) {
            if (search == a[mid]) {
                System.out.println("This element is present at " + mid + " index");
                break;
            } else if (search > a[mid]) {
                li = mid + 1;

            } else if (search < a[mid]) {

                hi = mid - 1;
            }
            mid = (li + hi) / 2;

        }
        if (a[li] > a[hi]) {
            System.out.println("This element is nor present in given Array");
        }
    }
}
