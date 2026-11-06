class PS1{
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        try{
           try {
            int c = a/b;
            System.out.println(c);  
           } catch (ArithmeticException e) {
            System.out.println("HaHa");
           } 
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
}