
class Special {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            int a = n;
            int sum = 0;
            int prod = 1;
            int res = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d;
                prod *= d;

                n /= 10;
            }
            res = sum + prod;
            if (res == a) {
                System.out.println(res);
            }

            n = a;

        }
    }
}
