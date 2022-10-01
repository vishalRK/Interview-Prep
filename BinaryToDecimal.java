class BinaryToDecimal {
    public static int pow(int n, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * n;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 1101;
        int k = 0;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d * pow(2, k++);
            n /= 10;
        }
        System.out.println(sum);
    }
}