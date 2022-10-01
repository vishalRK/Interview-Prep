class Multi1 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 10 } };
        System.out.print("{ ");
        for (int i = 0; i < a.length; i++) {
            {
                System.out.print("{ ");
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                    if (j <= a.length) {
                        System.out.print(", ");
                    }
                }
                System.out.print("} ");
            }
        }
        System.out.print("} ");
    }
}