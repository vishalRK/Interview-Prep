import java.util.ArrayList;

class P1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        ArrayList A = new ArrayList();
        String C = "Hello World";
        A.add(4);
        A.add("HI");
        A.add('J');
        A.add(C);
        A.add(2.1);
        A.add(null);
        A.add(2, "New");
        A.remove("New");
        A.remove("HI");
        A.addAll(1, A);

        System.out.println("\n List : A = " + A);

        System.out.println("Search List : A = " + A.containsAll(A));
        int a = A.get(1);
        System.out.println(A);
        ArrayList B = new ArrayList();
        // B.addAll(A);
        B.add(5);
        B.add("Bye");
        B.add('K');
        B.add(2.2);
        B.add(null);
        // B.addAll(A);
        B.addAll(2, A);

        System.out.println("\nNew List : = " + B);

    }

}