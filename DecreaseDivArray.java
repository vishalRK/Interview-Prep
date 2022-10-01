class DivisiCountArray {
    public static void main(String[] args) {
        int n[] = { 5, 9, 12, 16, 25 };
        int k = 6;
        int DecreseCount = 0;

        for (int i = 0; i < n.length; i++) {
            DecreseCount += (n[i] % k);
        }
        System.out.println(DecreseCount);
    }
}