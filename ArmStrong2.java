/* WRite program to count all the digits of a number */

class ArmStrong2 {
    public static void main(String[] args) {

        int n = 370;
        int sum = 0;
        int temp = n;
        int count = countDigit(n);
        while (n != 0) {
            int d = n % 10;

            sum += power(d, count);

            n = n / 10;

        }
        n = temp;
        if (sum == n) {
            System.out.println(n + " This number is Armstrong number");
        } else {
            System.out.println(n + " is not a Strong Number");
        }
    }

    public static int power(int n, int pow) {
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res = res * n;
        }
        return res;
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

}
