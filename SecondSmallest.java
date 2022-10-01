import java.util.Scanner;

class SecondSmallestNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Please enter a size of array : ");
        int size = sc.nextInt();// this is for taking input for array size
        int a[] = new int[size]; // this is the syntax to take input from user to define array size
        System.out.print("\n enter the number : ");
        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();// this is for taking input and store in array

        }
        System.out.print("A =  { ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" }\n\n");
        System.out.println("Step to find the second lowest number \n");
        System.out.println("1. Sort the array in Ascending order \n");
        System.out.print("\n A = { ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println(" }\n");
        for (int i = 0; i < a.length; i++) {
            System.out.println("\n Second Smallest Number from Array is : = " + a[i + 1]);
            break;
        }

    }
}