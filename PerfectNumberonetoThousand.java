class PerfectNumberonetoThousand {
    public static void main(String[] args) {
        System.out.print("this is  the range between 1 to 1000 perfect number is : ===> ");

        for (int n = 1; n <= 1000; n++) {
            int sum = 0;
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;

                    if (sum == n) 
                    {
                        System.out.print(n);    
                    }

                    }

                }

            }

        }

        System.out.println(" ");

    }

}
