class Anagram {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";

        boolean isAnagram = true;

        if (s1.length() != s2.length()) {
            isAnagram = false;
        } else {
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();

            sort(c1);
            sort(c2);

            for (int i = 0; i < c2.length; i++) {
                if (c1[i] != c2[i]) {
                    isAnagram = false;
                }

            }

        }
        if (isAnagram) {
            System.out.println("Both are Anagram");
        } else {
            System.out.println("Both are not Anagram");
        }
    }

    public static void sort(char[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}