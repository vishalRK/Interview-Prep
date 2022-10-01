class SingleDigit {

    public static void main(String[] args) {
        int n = 69;
        int sum = 0;

        while (n != 0) {

            int d = n % 10;
            sum += d;
            n = n / 10;

            if (sum >= 10) {
                n = sum;
                sum = 0;
            }

        }

        System.out.println(sum + " ==>now it is single digit");

    }

}