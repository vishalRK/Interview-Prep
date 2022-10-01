class Rever {
    public static void main(String[] args) {
        String s = "Welcome to thane";

        String a[] = s.split(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            String rev = "";
            for (int j = a[i].length() - 1; j >= 0; j--) {
                rev = rev + a[i].charAt(j);
            }
            System.out.print(rev + " ");
        }

    }
}