public class Bubble_char {
    public static void main(String[] args) {
        char name[] = { 'V', 'I', 'S', 'H', 'A', 'L' };
        for (int i = 0; i < name.length; i++) {

            for (int j = i + 1; j < name.length; j++) {

                if (name[i] > name[j]) {
                    char temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }

    }
}
