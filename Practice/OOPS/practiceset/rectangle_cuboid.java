abstract class shapes{
    abstract double area();
    abstract double perimeter();
}

class rectangle extends shapes{
    int length;
    int breadth;

    public rectangle(){     //default case constructor
        length = 0;
        breadth = 0;
    }

    public rectangle(int l, int b){     //parameterized constructor
        this.length = l;
        this.breadth = b;
    }

    int set_length(int l){      //setter for length
        return length = l;
    }

    int set_breadth(int b){     //setter for breadth
        return breadth = b;
    }

    int get_length(){       //getter for length
        return length;
    }

    int get_breadth(){      //getter for breadth
        return breadth;
    }


    double area(){
        return length * breadth;
    }

    double perimeter(){
        return 2 * (length + breadth);
    }
}

class cuboid extends rectangle{
    int height;
    public cuboid(){     //default case constructor
        super();
        height = 0;
    }

    public cuboid(int l, int b, int h){     //parameterized constructor
        super(l,b);
        this.height = h;
    }

    int set_length(int l){      //setter for length
        return super.set_length(l);
    }

    int set_breadth(int b){     //setter for breadth
        return super.set_breadth(b);
    }

    int get_length(){       //getter for length
        return super.get_length();
    }

    int get_breadth(){      //getter for breadth
        return super.get_breadth();
    }

    double area(){
        return 2*height*(length + breadth);
    }

    double perimeter(){
        return length * breadth * height;
    }
}


class rectangle_cuboid{
    public static void main(String[] args) {
        rectangle c1 = new cuboid(10,12,15);
        System.out.println("area of cuboid: " + c1.area());
        System.out.println("volume of cuboid: " + c1.perimeter());      //runtime polymorphism - dynamic method dispatch
    }
}