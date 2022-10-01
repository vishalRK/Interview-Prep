class NivenRange {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            int res = 0;
            int temp = n;
            while (n != 0) {
                int d = n % 10;

                res += d;

                n = n / 10;

            }
            n = temp;
            if (n % res == 0) {

                System.out.println(res);
            }
        }
    }
}