class Consonent {
    public static void main(String[] args) {
        String s = "Vishal";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U')
                    || (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                            || s.charAt(i) == 'o'
                            || s.charAt(i) == 'u')) {

            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}