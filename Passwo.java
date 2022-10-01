import java.util.*;

public class Check {
    public static void main(String[] args) {
        String s = "Mumbai@34";
        List<Character> a = new ArrayList();
        a.add('@');
        a.add('#');
        a.add('!');
        a.add('.');
        a.add('_');

        boolean isUpper = false, isLower = false, isNumric = false, isSpecial = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                isUpper = true;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'b') {
                isLower = true;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                isNumric = true;
            }
            if (a.contains(s.charAt(i))) {
                isSpecial = true;
            }

        }

        if (s.length() >= 8 && isUpper && isLower && isNumric && isSpecial) {
            System.out.println("Password IS Strong");
        } else {
            System.out.println("PAssword is not Strong");
        }
    }
}