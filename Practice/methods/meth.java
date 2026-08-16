class meth{
    static int addition(int a, int b){      //methods
        int z;
        z = a + b;
        return z;
    }

    static void greet(){
        System.out.println("YAMATEEE KUDASAIII AHH AHHH"); 
    }

    static void change_arr(int [] arr){
         arr[0] = 98;
        
    }

    static void fahhh(){
        System.out.println("FAAAHHHHH!"); //method overloading
    }

    static void fahhh(String a){    //method overloading
        System.out.println("FAAAHHHH " + a);    //parameter is a
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println(addition(x, y));     //calling the method
        greet();

        System.out.println("before changing the integer at index 0: ");
        int [] marks = {52,67,69,88,91};
        for(int m:marks){
            System.out.println(m);
        }

        System.out.println("after changing the integer at index 0: ");
        change_arr(marks);
        for(int m:marks){
            System.out.println(m);
        }

        fahhh();
        fahhh("teri mkc");  //teri mkc is a argument passed to the parameter in the fahhh method
        
    }
}