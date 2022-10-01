class Linear {
    public static void main(String[] args) {
        int A[] = { 6, 2, 4, 1, 3, 5, 2 };
        boolean B = true;
        int search = 13;

        for (int i = 0; i < A.length; i++) {
            if (search == A[i]) {
                System.out.println("element is present at the " + i + " position");
                B = false;
            }
        }
        if (B == true) {
            System.out.println("element is not present in that array");
        }
    }
}