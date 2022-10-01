class LargerNumber {
    public static void main(String[] args) {
        int a[] = { 6, 4, 1, 3, 5, 2 };
        int large = Integer.MIN_VALUE;
        int i = 0;
        while (a[i] > large) {
            large = a[i];
            i++;
        }
        System.out.println(large);
    }
}