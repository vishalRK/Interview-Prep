import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        LinkedHashMap H = new LinkedHashMap();
        H.put(4, "Sita");
        H.put(2, "Ram");
        H.put(3, "Hanuman");
        H.put(6, "Laxman");

        System.out.println("--------------------------------");
        System.out.println("Linked HashMap: " + H);
        HashMap H1 = new HashMap();
        H1.put(4, "Sita");
        H1.put(2, "Ram");
        H1.put(3, "Hanuman");
        H1.put(6, "Laxman");
        LinkedHashMap h = new LinkedHashMap();
        h.put(1, "Sita");
        h.put(4, "Ram");
        h.put(9, "Hanuman");
        h.put(2, "Laxman");
        h.putAll(H1);

        System.out.println("--------------------------------");
        System.out.println("HashMap: " + H1.entrySet());
        System.out.println("HashMap: " + h);
        System.out.println("HashMap: " + h.containsKey(2));
        System.out.println("HashMap: " + h.containsValue("Ram"));
        h.remove(2);
        System.err.println("HashMap: " + h);
        h.clear();
        System.err.println("HashMap: " + h);

        TreeMap H2 = new TreeMap();
        H2.put(4, "Sita");
        H2.put(2, "Ram");
        H2.put(5, "Hanuman");
        H2.put(6, "Laxman");
        System.out.println("--------------------------------");
        System.out.println("TreeMap ASC: " + H2);
        System.out.println("TreeMap: DESC" + H2.descendingMap());
    }
}
