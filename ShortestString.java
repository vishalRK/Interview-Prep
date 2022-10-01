class ShortestString {
    public static void main(String[] args) {
        String s = "dal rice w papads";
        String a[] = s.split(" ");

        String c = " ";
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() <= c.length()) {
                c = a[i];
            }
        }

        System.out.println(c);
    }

}

// JAved Sir Logic

/*
 * String a[] ={"dal","rice","w","papads"};
 * int min= 0;
 * for(int i = 0; i < a.length; i++)
 * {
 * if(a[i].length() < a[min].length())
 * {
 * min = i;
 * }
 * }
 * System.out.println(a[min]);
 */