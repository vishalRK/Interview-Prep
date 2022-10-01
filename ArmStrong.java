/* the given number is Arm Strong number or not */
class ArmStrong {
    public static void main(String[] args) {
        int n = 5;
        int pow = 3;
        int res = 1;

        for (int i = 1; i <= pow; i++) {
            res = res * n;

        }
        System.out.println(res);
    }
}