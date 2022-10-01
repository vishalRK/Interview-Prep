class fibonaci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonaci series of first 10 number is ====> " + a + ", " + b + ", ");
        for (int i = 1; i <= 10; i++) {

            int sum = a + b;
            a = b;
            b = sum;

            System.out.print(sum);
            if (i < 10) {
                System.out.print(", ");

            }
        }
    }
}
