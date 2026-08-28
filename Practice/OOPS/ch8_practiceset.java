class employee{
    int salary;
    String name;

    public int get_salary(){
          return salary;
    }

    public String get_name(){
        return name;
    }

    public String set_name(String n){
        return name = n;
    }

    public int set_salary(int n){
       return salary = n;
    }

}

class cellphone{
    public void ringing(){
        System.out.println("Cellphone is Ringing...");
    }

    public void vibrating(){
        System.out.println("Cellphone is Vibrating...");
    }
}

class square{
    int side;
    public int side(int n){
        return side = n;
    }

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int breadth;
    public int len(int n){
        return length = n;
    }

    public int breadth(int n){
        return breadth = n;
    }
    
    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
}

class circle{
    int radius;
    Double pie = 3.14;

    public int radius(int n){
        return radius = n;
    }

    public double  area(){
        return pie*radius*radius;
    }

    public double perimeter(){
        return 2*pie*radius;
    }
}

class tommy_vercetti{
    //hitting, running and firing
    
    public void hit(){
        System.out.println("Tommy Hits a guy!");
    }

    public void run(){
        System.out.println("Tommy Runs");
    }
    
    public void fire(){
        System.out.println("Tommy Fires the gun!");
    }
    
}

class ch8_practiceset{
    public static void main(String[] args) {
        System.out.printf("\n employee class: \n");
        employee e1 = new employee();
        e1.set_name("yash");
        e1.set_salary(50000);
        System.out.println(e1.name);
        System.out.println(e1.salary);

        System.out.printf("\n cellphone class: \n");
        cellphone c1 = new cellphone();
        c1.ringing();
        c1.vibrating();

        System.out.printf("\n square class: \n");
        square s1 = new square();
        s1.side = 5;
        System.out.println("area of square: "+s1.area());
        System.out.println("perimeter of square"+s1.perimeter());

        System.out.println("\n Rectangle class: \n");
        rectangle r1 = new rectangle();
        r1.len(5);
        r1.breadth(7);
        System.out.println("area of rectangle: " + r1.area());
        System.out.println("perimeter of rectangle: " + r1.perimeter());

        System.out.println("\n class tommy_vercetti: \n");
        tommy_vercetti t1 = new tommy_vercetti();
        t1.hit();
        t1.run();
        t1.fire();

        System.out.println("\n class circle: \n");
        circle circle1 = new circle();
        circle1.radius = 5;
        System.out.println("area of circle: " +  circle1.area());
        System.out.printf("perimeter of circle: %.2f", circle1.perimeter());
    }
}