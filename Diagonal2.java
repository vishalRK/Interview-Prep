public class Diagonal2 {
    public static void main(String[] args) {
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        for (int i = 0; i < n.length; i++) {

            for (int j = 0; j < n.length; j++) {
                if ((i + j == n.length - 1)) {
                    sum += n[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}
