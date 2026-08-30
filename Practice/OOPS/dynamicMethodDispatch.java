class phone{
    public void greet(){
        System.out.println("Hello i'm a normal phone!");
    }

    public void on(){
        System.out.println("Turning on Phone!");
    }
}

class smartPhone extends phone{
    public void greet (){
        System.out.println("Hello i'm a Smart Phone!");
    }

    public void on(){
        System.out.println("Turning on smartPhone!");
    }
}



class dynamicMethodDispatch{
    public static void main(String[] args){
        phone p1 = new phone();
        p1.greet();

        smartPhone sm1 = new smartPhone();
        sm1.greet();

        phone p2 = new smartPhone();
        p2.on();
    }
}