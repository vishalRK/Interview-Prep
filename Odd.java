/*  Write a program to print sum of all the odd no in between 20 to 30  */
class Odd {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print(" \n Odd Number range from 20 to 30 is : ==> ");
        for (int i = 20; i < 30; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                sum += i;
                if (i < (30 - 1)) {
                    System.out.print(" + ");

                }

            }
        }
        System.out.print(" = " + sum);
        System.out.println("\n");

    }
}
