import java.util.Scanner;
class fibonacci{
    static void fib(int n){
        int x = 0;
        int y = 1;
        System.out.printf(" %d ",x);
        System.out.printf(" %d ", y);
        
        for(int i = 1;i<n-1;i++){   //this is done iteratively and not recursively using a for loop!
            int z = x + y;
            System.out.printf(" %d ", z );
            x = y;
            y = z;
        }
        
    }

    static int fibo(int n){
    if(n == 0 || n == 1){
        return n;
    }
    else{
         return fibo(n-1) + fibo(n-2);
    }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers you want: ");
        int a = sc.nextInt();
        fib(a);
        //System.out.println(fibo(6));


        
    }
}