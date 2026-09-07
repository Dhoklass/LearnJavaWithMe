class circle{
    int radius;
    circle(int r){
        this.radius = r;
    }

    public int set_radius(int r){
        return radius = r;
    }

    public int get_radius(){
        return radius;
    }

    double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle{
    int height;
    cylinder(int r, int h){
        super(r);
        this.height = h;
    }

    double area(){
        return 2 * Math.PI * radius * radius * height;
    }
}


class practiceset{
    public static void main(String[] args){
        cylinder c1 = new cylinder(10,15);
        //System.out.println(c1.area());
        //c1.set_radius(5);
        System.out.println(c1.get_radius());

    }
}