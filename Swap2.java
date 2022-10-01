/* swapping without Third variable */
class Swap2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.println("\n Before Swapping : ==>  a = " + a + ", b = " + b);

        a = a + b;

        b = a - b;

        a = a - b;

        System.out.println("\n After Swapping : ==>  a = " + a + ", b = " + b);
    }
}
