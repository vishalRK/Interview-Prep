import java.util.Scanner;

class Interview2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[][] = {
                { 11, 22, 33 },
                { 44, 55, 66 },
                { 77, 88, 99 }
        };
        int x = sc.nextInt();
        // int a[][] = new int[n.length][n.length];
        boolean find = true;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (x == n[i][j]) {
                    System.out.print(n[i][j]);
                    find = false;
                    break;

                } else {

                    find = true;
                    break;
                }

            }

        }

        if (true == find) {
            System.out.println(" Found");
        } else {
            System.out.println("Not Found");
        }

    }
}