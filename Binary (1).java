public class Binary {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int search = 8;
        int li = 0;
        int hi = a.length - 1;

        int mi = (li + hi) / 2;

        while (li <= hi) {
            if (search == a[mi]) {
                System.out.println("The element is prsent at " + mi);
                break;
            } else if (search > a[mi]) {
                li = mi + 1;
            } else if (search < a[mi]) {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > mi) {
            System.out.println("this element is not present in this array");
        }
    }
}
