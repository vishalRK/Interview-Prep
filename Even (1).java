class Even {
    public static void main(String[] args) {
        int[] a = { 5, 10, 3, 8, 12 };
        System.out.print("Even Elements :");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}