class SeprateNumber {
    public static void main(String[] args) {
        int n = 158;
        System.out.println("\n Before the seprate number: ==> " + n);
        System.out.print("\n After the seprate number: ==> ");
        while (n != 0) {
            int d = n % 10;
            System.out.print(d);
            n /= 10;
        }
        System.out.println(" ");
    }
}
