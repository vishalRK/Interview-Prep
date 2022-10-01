class OddDigitProd {
    public static void main(String[] args) {
        int n = 1235769;
        int prod = 1;
        System.out.print("this is the odd number product seprated from given number : ==> ");
        while (n != 0) {
            int d = n % 10;
            if (d % 2 != 0) {
                prod = prod * d;
                System.out.print(d);
                if (d != 1) {
                    System.out.print(" * ");

                }
            }
            n = n / 10;
        }
        System.out.println(" = " + prod);
    }
}