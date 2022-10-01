class OddSumNumber {
    public static void main(String[] args) {
        int n = 1234556;
        int sum = 0;
        System.out.print("\n the addition of odd number from giver number is : ==> ");
        while (n != 0) {
            int d = n % 10;
            if (d % 2 != 0) {
                sum += d;
                System.out.print(d);
                if (d != 1) {
                    System.out.print(" + ");
                }
            }
            n = n / 10;
        }

        System.out.print(" = " + sum);

    }
}