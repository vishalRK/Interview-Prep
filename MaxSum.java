class MaxSum {
    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int max = 0;
        for (int i = 0; i < n.length; i++) {
            int sum = 0;
            for (int j = 0; j < n[i].length; j++) {
                sum += n[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}