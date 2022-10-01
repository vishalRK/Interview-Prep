import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b[] = new int[a];

        for (int i = 0; i < b.length; i++) {
            System.out.print("please Enter the number : ");
            b[i] = sc.nextInt();

        }
        System.out.println("this is  all integers from array which is divisible by 3 : = ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 3 == 0) {
                System.out.print(b[i] + ", ");
                sum += b[i];
            }
        }
        System.out.println("\n this is sum of all integer from array which is divisible by 3 :" + sum);
    }

}