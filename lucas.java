class lucas {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        System.out.print("\n Lucas series of first 10 number is : ==> " + a + ", " + b + ", ");
        for (int i = 0; i <= 10; i++) {
            int sum = a + b;
            a = b;
            b = sum;

            System.out.print(sum);
            if (i < 10) {
                System.out.print(", ");

            }
        }
        System.out.println(" ");
    }

}
