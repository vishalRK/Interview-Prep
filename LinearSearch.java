import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = { 1, 8, 3, 2, 4 };

        boolean B = true;

        System.out.print("please Enter The number you want to search :");
        int search = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
            if (search == n[i]) {
                System.out.println("this element is present at " + i + " index");
                B = false;
            }
        }
        if (B == true) {
            System.out.println("this element is not present ");
        }
    }
}