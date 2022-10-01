import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList A = new ArrayList();

        A.add(10);
        A.add(null);
        A.add('c');
        A.add("Hi");

        System.out.println(A);

        System.out.println("==================== get Index ====================");
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i) + ", ");

        }
        System.out.println("\n==================== for each Loop ================");
        for (Object o : A) {
            System.out.println(o);
        }
        System.out.println("\n==================== Iterator ====================");
        Iterator I = A.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        }
        System.out.println("\n==================== List Iterator ====================");
        ListIterator J = A.listIterator();
        while (J.hasNext()) {
            System.out.println(J.next());
        }
        System.out.println("\n==================== List Iterator Reversed order ====================");

        while (J.hasPrevious()) {
            System.out.println(J.previous());
        }
        System.out.println("\n==================== sort method ====================");
        // Collections.sort(A);
        // System.out.println("After Sorting ASC: " + A);
        Collections.reverse(A);
        System.out.println("After Sorting DESC: " + A);

    }
}
