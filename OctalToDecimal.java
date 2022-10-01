class OctalToDecimal {
    public static int pow(int n, int p) {
        int res = 1;
        for (int i = 0; i <= p; i++) {
            res += n;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 14;
        int Oct = 0;
        int k = 0;
        while (n != 0) {
            int d = n % 10;
            Oct = Oct + d * pow(8, k++);

        }
        System.out.println(Oct);

    }

}
