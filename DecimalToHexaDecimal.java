class DecimalToHexaDecimal {
    public static void main(String[] args) {
        String Hexa = " ";
        int n = 10;
        int temp = n;
        while (n > 0) {
            int rem = n % 16;

            if (rem == 10) {
                Hexa = "A" + Hexa;
            } else if (rem == 11) {
                Hexa = "B" + Hexa;
            } else if (rem == 12) {
                Hexa = "C" + Hexa;
            } else if (rem == 13) {
                Hexa = "D" + Hexa;
            } else if (rem == 14) {
                Hexa = "E" + Hexa;
            } else if (rem == 15) {
                Hexa = "F" + Hexa;
            } else {
                Hexa = rem + Hexa;
            }
            n = n / 16;

        }

        System.out.println(temp + " :==  " + Hexa);
    }
}