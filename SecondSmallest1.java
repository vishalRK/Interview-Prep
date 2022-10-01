class SecondSmallestNumber1 {
    public static void main(String[] args) {
        int n[] = { 6, 4, 1, 3, 5, 2, 1 };

        int small_num_1 = Integer.MAX_VALUE;
        int small_num_2 = Integer.MAX_VALUE;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < small_num_1) {
                small_num_2 = small_num_1;
                small_num_1 = n[i];
            } else if (n[i] < small_num_2 && n[i] != small_num_2) {
                small_num_2 = n[i];
            }
        }
        System.out.println("SecondSmallestNumber1: = " + small_num_2);
    }
}