class Productofodd {
    public static void main(String[] args) {
        System.out.print("\nWnter the Product of odd number the range is between 51 to 60 : ===> ");
        int sum = 1;
        for (int i = 51; i <= 60; i++) {
            if (i % 2 != 0) {

                sum *= i;
                System.out.print(i);
                if (i < 60 - 1) {
                    System.out.print(" * ");
                }
            }
        }
        System.out.print(" = " + sum + "\n");
    }
}