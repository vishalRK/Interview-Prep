class P4 {
    public static void main(String[] args) {
        int[] a = { 5, 10, 3, 8, 12 };
        int Prod = 1;
        for (int i = 0; i < a.length; i++) {
            Prod *= a[i];
        }
        System.out.println(Prod);
    }
}