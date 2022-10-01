class Matrix_Add {
    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                a[i][j] += n[i][j];

                System.out.print(a[i][j] + " ");
            }
            System.out.println("");

        }

    }

}
