/* Write a program to print sum of all the even no in between 1 to 20 */
class Even {
    public static void main(String[] args) {
        System.out.print("\n Even number 1 to 20 is: ==>  ");
        int sum = 1;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                sum += i;
                if (i < 20) {
                    System.out.print(" + ");

                }
            }

        }
        System.out.print(" = " + sum);
        System.out.print("\n");
    }

}