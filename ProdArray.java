
public class ProdArray {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5 };
        int prod = 1;
        for (int i = 0; i < n.length; i++) {
            prod = prod * n[i];
        }
        System.out.println("Product of the Array : " + prod);
    }
}
