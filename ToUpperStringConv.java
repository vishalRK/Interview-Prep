class ToUpperCaseString {
    public static void main(String[] args) {
        String s = "vishal";

        char a[] = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] - 32);
        }
        s = new String(a);
        System.out.println(s);
    }

}