class MultiArr {
    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int a[][] = { { 1, 1, 1 },
                { 1, 2, 0 },
                { 0, 1, 1 } };

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a.length; j++) {
        // n[i][j] *= a[j][i];
        // System.out.print(n[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int sum = 0;
                for (int k = 0; k < a.length; k++) {
                    sum = sum + n[i][k] * a[k][j];
                }
                System.out.print(sum + " ");

            }
            System.out.println(" ");
        }
    }
}