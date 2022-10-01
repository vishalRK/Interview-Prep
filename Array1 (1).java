import java.util.Scanner;

class Stored {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Size: =");
        int s = sc.nextInt();
        int a[] = new int[s];

        for (int i = 0; i < 5; i++) {
            System.out.print("Please Enter number: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}