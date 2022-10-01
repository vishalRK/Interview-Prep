class DecimalToOctal {
    public static void main(String[] args) {

        String Oct = "";
        int n = 5;
        while (n > 0) {
            int rem = n % 8;
            Oct = Oct + rem;
            n = n / 8;
        }
        System.out.println("Oct: " + Oct);
    }
}