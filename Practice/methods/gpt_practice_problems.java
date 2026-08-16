class gpt_practice_problems{
    static void greet(){
        System.out.println("Hello, welcome to Java!");
    }

    static void square(int n){
        double sqr = Math.pow(n, 2);
        System.out.println("Square of " + n + " is " + sqr);
    }

    static int addition(int a, int b){
        return a + b;
    }

    static boolean isEven(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static int factorial(int a){
        int result = 1;
        for (int  i= 1; i <= a;i ++) {
                result *= i; 
        }
        return result;
    }
    public static void main(String[] args) {
        greet();
        square(5);
        int x = 5;
        int y = 10;
        System.out.println("Addition of " + x + " and " + y + " is: " + addition(x, y));
        System.out.println(isEven(x));
        System.out.println(factorial(5));
    }
}