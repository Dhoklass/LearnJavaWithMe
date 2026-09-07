interface interface1{
    void meth1();
}

interface interface2 extends interface1{
    void meth2();
}

class sample implements interface2{
    public void meth1(){
        System.out.println("meth1");
    }

    public void meth2(){
        System.out.println("meth2");
    }
}

class interface_extends_interface{
    public static void main(String[] args) {
        sample s1 = new sample();
        s1.meth1();
        s1.meth2();
    }
}