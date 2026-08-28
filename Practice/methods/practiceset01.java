class practiceset01{
    static void multiplication_table(int n){
        for(int i = 0; i<=10;i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    static void pattern(){
        for(int i = 0; i<=4;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    static void pattern_recurse(int n){
        if(n > 0){
            pattern_recurse(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //recursive function to calculate sum of first n natural numbers
    static int sumofNnumbers(int n){
        if(n == 0){
           return 0; 
        }
        else{
            return n + sumofNnumbers(n - 1);
        }
    }

    static void pattern_reverse(){
        for(int i=5;i>=0;i--){
            for (int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    static void pattern_reverse_recurse(int n){ 
        if(n>0){
            for(int i=n;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            pattern_reverse_recurse(n-1);
        }
    }
    
    static int nthTermOfFibonacciSeries(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return nthTermOfFibonacciSeries(n-1) + nthTermOfFibonacciSeries(n-2);
        }
    }
        public static void main(String[] args) {
        multiplication_table(5);
        pattern();
        System.out.println("sum of n numbers: " + sumofNnumbers(5));
        pattern_reverse();

        System.out.println(nthTermOfFibonacciSeries(6));

        pattern_recurse(5);
        pattern_reverse_recurse(5);
    }
}