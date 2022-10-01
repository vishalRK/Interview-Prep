import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add(20);
        set.add('c');
        set.add("Hi");
        set.add('m');

        System.out.println("================= HASH set : ================");
        System.out.println(set);
        for (Object o : set) {
            System.out.print(o.hashCode());

        }

        LinkedHashSet set1 = new LinkedHashSet();
        set1.add(10);
        set1.add(20);
        set1.add('c');
        set1.add("Hi");

        System.out.println("\n================= Linked HASH set : ================");
        System.out.println(set1);

        TreeSet set2 = new TreeSet();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);

        System.out.println("================= Tree HASH set : ================");
        System.out.println(set2);
    }
}
