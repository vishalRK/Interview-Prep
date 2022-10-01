class SpecialTaskForce {
    public static void main(String[] args) {
        String s = "@Vishal!@#$%^&*";

        char a[] = s.toCharArray();
        int count = 0;
        char n[] = { '!', '@', '#', '&', '$', '%', '^', '*' };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (a[i] == n[j]) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}