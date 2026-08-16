class varargs{
    static int addition(int ...arr){    //varArgs = putting ...  in front a variable name makes 
                                        // it a varargs and accepts any no of inputs and turns them into array while method overloading
                                        // hence there is no need to make many methods of same name!
        int result = 0;
        for(int x:arr){
            result += x;
            
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(addition(1,3,5,7));
        System.out.println(addition(4,5,10,12));
    }
}