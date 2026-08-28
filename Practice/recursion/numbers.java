class numbers{
    static void nombers(int n){
        if(n == 0){
            System.out.println(0);
        }
        else{
            nombers(n - 1);
            System.out.println(n);
        }
        }


    static void nos_reverse(int n){
        if(n == 0){
            System.out.println(0);}
        else{
            System.out.println(n);
            nos_reverse(n - 1);
        }
        }
        


    static void even_nos(int n){
        if(n < 0){
            return;
        }
        even_nos(n-1);
        if(n%2 == 0){
            System.out.println(n);
        }
        
            }
        
    

    static void odd_nos(int n){
        if(n < 0 ){
            return;
        }
        odd_nos(n-1);
        if(n%2!=0){
            System.out.println(n);
        }
            }
        
    

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }

    }

    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        
        else{
            return x * power(x,n-1);
        }
    }

    // static int power_advanced(int x,int n){

    //     if(n == 0){
    //         return 1;
    //     }
    //     int y;
    //     if(n%2 == 0){
    //         y = x * power_advanced(x, (n/2)-1);
    //     }
    //     int z = y*y;
    //     return z;
    // }

    static int sumofdigits(int n){
        if(n == 0){
            return 0;
        }   
        else{
            int x = n % 10;
            return x + sumofdigits(n/10);
        }
    }

    static int countNoOfDigits(int n){
        if(n == 0){
            return 0;
        }
        else{
            return 1 + countNoOfDigits(n/10);

        }
     
    }

    static int reverseNo(int n, int result){
        if(n == 0){
            return result;
        }
        else{
            int x = n%10;
            result = reverseNo(n/10, result * 10 + x);

        }
        return result;
    }

    static boolean isPalindrome(String s){
        if(s.length() <=1){
            return true;
        }
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);
        
        if (firstChar == lastChar){
            return isPalindrome(s.substring(1, s.length() - 1));
            } 
        
        else{ 
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println("number from 0 to n: ");
        nombers(5);

        System.out.println("number from n to 0: ");
        nos_reverse(5);
        System.out.println("even numbers from 0 to n: ");
        even_nos(10);
        System.out.println("odd numbers from n to 0: ");
        odd_nos(10);

        System.out.println("factorial of n: ");
        System.out.println(factorial(6));

        System.out.println("x raised to the power n: ");
        System.out.println(power(2,4));

        System.out.println("sumOfDigits: "+sumofdigits(1234));

        System.out.println("countNoOfDigits: "+countNoOfDigits(12345));

        System.out.println("is palindrome: " +  isPalindrome("xyzyx"));
        

    }
    }






