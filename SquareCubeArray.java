class SquareCubeArray {
    public static void main(String[] args) {
        int n[] = { 10, 25, 1 };

        for (int i = 0; i < n.length; i++) {
            int count = 0;
            for (int j = 1; j <= n[i]; j++) {
                if (j * j <= n[i]) {
                    count++;
                }
                if (j * j * j <= n[i] && j * j * j != j * j) {
                    count++;
                }

            }
            System.out.println(count);
        }

    }
}