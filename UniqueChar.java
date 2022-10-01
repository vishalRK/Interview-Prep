class Uniquechar {
    public static void main(String[] args) {
        String s = "hello";

        char a[] = s.toCharArray();

        boolean b[] = new boolean[a.length];

        for (int i = 0; i < b.length; i++) {
            int count = 1;
            if (b[i] == false) {

                for (int j = i + 1; j < b.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        b[j] = true;

                    }
                }

            }
            if (count == 1) {
                System.out.println(a[i] + " " + count);
            }
        }
    }
}