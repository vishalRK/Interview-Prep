/* Swapping using with third variable called temp */
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("\n Before Swapping : ==>  a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\n After Swapping :  ==>  a = " + a + ", b = " + b);

    }
}
