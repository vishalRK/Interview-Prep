public class DifferenceArr {
    public static void main(String[] args) {
        int a[] = { 1, 0, 1, 5, 8, 7, 0, 1, 1 };

        int good = 0;
        int bad = 0;
        int b[] = new int[a.length];
        int k = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            b[i] = a[k];
            k--;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                good += a[i];
            } else {
                bad += a[i];
            }
        }
        System.out.println("good " + good);
        System.out.println("bad " + bad);
        int differ = good - bad;
        System.out.println("differ " + differ);

    }
}
