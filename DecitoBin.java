class DecimalToBinary {
    public static void main(String[] args) {
        String bin = "";
        int n = 12;
        int temp;
        temp = n;
        while (n > 0) {

            int rem = n % 2;
            bin = rem + bin;
            n = n / 2;
        }
        System.out.println(temp + ":==" + bin);

    }
}