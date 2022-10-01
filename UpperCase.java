public class UpperCase {
    public static void main(String[] args) {
        char c [] = {'v','i','s','h','a','l'};

        for(int i = 0; i < c.length; i++) {
        
            if(c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char)(c[i]-32);
            }
            System.out.print(c[i]);
        }

    }
    
}
