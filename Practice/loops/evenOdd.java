class evenOdd{
    public static void main(String[] args) {
        System.out.println("Even nos: ");
        for(int i = 0; i<10; i++){
            
            if( i % 2 == 0 ){
                System.out.println(i);
            }
        }

        System.out.println("Odd nos: ");
        for(int i = 0; i<10;i++){
            
            
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}