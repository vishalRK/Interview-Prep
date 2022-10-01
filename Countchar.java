class Countchar {
    public static void main(String[] args) {
        String s = "thiruchitrambalam";
        char a[] = s.toCharArray();
        boolean b[] = new boolean[a.length];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (b[i] == false) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        b[j] = true;
                    }
                }
                sum += count;
                System.out.println(a[i] + " " + count);
            }

        }
        System.out.println(sum);
    }
}