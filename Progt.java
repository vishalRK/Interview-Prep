public class Progt {
    public static void main(String[] args) {
        String s = "1B2A3NGALORE4";
        int count = 0;
        int sum = 0;
        String out = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
                out = out + s.charAt(i);
            }

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                sum = sum + (s.charAt(i) - '0');

            }

        }
        System.out.print(count + out + sum);

    }
}
