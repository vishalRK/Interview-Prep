class MissingChar {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abcd";

        int i = 0;
        for (; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
        }
        System.out.println(s1.charAt(i));
    }

}
