class Strong {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {

            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 148;
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int d = n % 10;

            sum += factorial(d);

            n = n / 10;
        }
        n = temp;
        if (n == sum) {
            System.out.println("\n" + n + " is Strong Nmber");
        } else {
            System.out.println("\n" + n + " is not Strong Nmber");
        }
    }
}