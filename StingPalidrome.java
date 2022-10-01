class Program {
    public static void main(String[] args) {
        String s = "Lev el   ";
        s = s.trim();

        System.out.println(s);

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

}