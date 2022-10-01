class PercentageString {
    public static void main(String[] args) {
        String s = "ThAne";

        char a[] = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if ((a[i] == 'a' || a[i] == 'A') || (a[i] == 'e' || a[i] == 'E') || (a[i] == 'i' || a[i] == 'I')
                    || (a[i] == 'o' || a[i] == 'O') || (a[i] == 'u' || a[i] == 'U')) {
                a[i] = '%';
            }
        }

        s = new String(a);
        System.out.println(s);
    }
}