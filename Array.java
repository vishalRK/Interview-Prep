
public class Array {
    public static void main(String[] args) {
        // int n[] = { 1, 2, 3, 4, 5, 6, 7 };
        // char n[] = { 'V', 'I', 'S', 'H', 'A', 'L' };
        // byte n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // float n[] = { 1.1f, 1.2f, 1.3f, 1.4f, 1.5f, 1.6f };
        // double n[] = { 1.11231231, 1.212312321, 1.31231231, 1.4123123123, 1.5131231,
        // 1.612312, 1.7123123, 1.8123123 };
        String n[] = { "I", "Love", "My", "India" };
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i < n.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
