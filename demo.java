import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int c = (m - k);
        if (n <= c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}