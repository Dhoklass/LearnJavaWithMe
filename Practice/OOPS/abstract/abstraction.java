abstract class animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class dog extends animal{
    void makeSound(){
        System.out.println("bhow bhow!");
    }

    void sleep(){
        System.out.println("Dog is sleeping");
    }
}

class abstraction{
    public static void main(String[] args) {
        //animal a = new animal();       //error as abstract class ka object nahi bana sakte!!
        
        animal a = new dog();
            a.makeSound();
            a.sleep();
        
    }
}