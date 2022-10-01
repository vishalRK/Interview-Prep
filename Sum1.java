class Sum1 {
    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                sum = sum + n[i][j];
            }

        }

    }
}