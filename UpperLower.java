public class UpperLower {
    public static void main(String[] args) {
        char c[] = { 'v', 'I', 's', 'H', 'a', 'L' };

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char) (c[i] - 32);
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] = (char) (c[i] + 32);
            }
            System.out.print(c[i]);
        }
    }
}
