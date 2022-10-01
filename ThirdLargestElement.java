class ThirdLargestElement {
    public static void main(String[] args) {
        int n[] = { 6, 4, 1, 3, 2, 1, 8 };

        int Large_num_1 = Integer.MIN_VALUE;
        int Large_num_2 = Integer.MIN_VALUE;
        int Large_num_3 = Integer.MIN_VALUE;
        int Large_num_4 = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {

            if (n[i] > Large_num_1) {

                Large_num_3 = Large_num_2;
                Large_num_2 = Large_num_1;
                Large_num_1 = n[i];

            } else if (n[i] > Large_num_2 && n[i] != Large_num_2) {
                Large_num_3 = Large_num_2;
                Large_num_2 = n[i];
            } else if (n[i] > Large_num_3 && n[i] != Large_num_3) {

                Large_num_4 = Large_num_3;

                Large_num_3 = n[i];
            }

        }
        System.out.println("\n FirstLargestElement id : = " + Large_num_1);
        System.out.println("SecondLargestElement id : = " + Large_num_2);
        System.out.println("thirdLargestElement id : = " + Large_num_3);
    }
}