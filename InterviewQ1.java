import java.util.Scanner;

class Interview1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int findElement = 0;

        int sum1 = 0;
        /**
         * int row = size;
         * int col = size;
         */

        int n[][] = {
                { 11, 22, 33 },
                { 44, 55, 66 },
                { 77, 88, 99 }
        };
        int row = 1;
        int col = 1;

        /*
         * for (int i = 0; i < n.length; i++) {
         * for (int j = 0; j < n.length; j++) {
         * n[i][j] = sc.nextInt();
         * }
         * }
         */

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("\n\n X :");
        int x = sc.nextInt();

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (x == n[i][j]) {

                    row += i;
                    col += j;
                    System.err.println("X =" + n[i][j] + " present at the " + row + " row and " + col + " coloumn");

                } 
            }
        }

            System.out.println("ROW : " + row + "\nCOL : " + col + "\nRow + Col = " + (row + col) + "\n\n");
            System.out.print("\n\nS = ");
            for (int i = 0; i < n.length; i++) {

                for (int j = 0; j < n.length; j++) {

                    if ((row + col) % 2 == 0 && n[i][j] % 2 == 0) {

                        System.out.print("(");
                        int sum = 0;
                        int count = 0;

                        while (n[i][j] != 0) {
                            int d = n[i][j] % 10;
                            System.out.print(d);
                            count++;
                            if (count == 1) {
                                System.out.print(" + ");
                            }
                            sum += d;

                            n[i][j] /= 10;

                        }

                        System.out.print(")+");

                        sum1 += sum;

                    }

                }

                System.out.print(" ");
            }
            System.out.println("\nsum = " + sum1);
        }

    }
}