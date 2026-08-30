class a{
    String x;
    public a(String x){
        this.x = x;
    }

    public void getx(){
        System.out.println(x);
    }
}

class b extends a{
    String y;

    public b(String x, String y){
        super(x);
        this.y = y;
    }

    public void getx(){
        System.out.println(y);
    }
}


class method_overriding{
    public static void main(String[] args) {
        a a1 = new a("hello");
        a1.getx();
        
        b b1 = new b("hello1","hello2");
        b1.getx();

        
    }
}