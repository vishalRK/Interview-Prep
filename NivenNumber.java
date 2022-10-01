/* Write a program to check given number is niver or not. */
class Niven {
    public static void main(String[] args) {
        int n = 28;
        int temp = n;
        int res = 0;
        while (n != 0) {
            int d = n % 10;

            res = res + d;

            n = n / 10;
        }
        n = temp;
        if (n % res == 0) {

            System.err.println("\n" + n + " is niven number");
        } else {
            System.out.println("\n" + n + " is not niven number");
        }
    }
}