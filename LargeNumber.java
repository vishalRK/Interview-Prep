class LargeNumber {
    public static void main(String[] args) {
        int n[] = { 2, 10, 12, 3, 4, 5, 6, 9 };

        int large = Integer.MIN_VALUE;

        int i = 0;
        while (i < n.length) {
            if (n[i] > large) {
                large = n[i];
            }
            i++;
        }
        System.out.println(large);
    }
}