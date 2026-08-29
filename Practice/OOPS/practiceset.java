class cylinder{
    private int radius;
    private int height;
    double pie = 3.14;
    String CylinderName;

    public cylinder(){      //default case constructor
        radius = 0;
        height = 0;
        CylinderName = null;
    }
    
    public cylinder(int r, int h, String name){      //accepting user input using constructor
        this.radius = r;
        this.height = h;
        this.CylinderName = name;
    }

    //setting and getting height and radius using getter and setter
    public int setHeight(int n){
        return height = n;
    }

    public int setRadius(int n){
        return radius = n;
    }

    public int getHeight(){
        return height;
    }

    public int getRadius(){
        return radius;
    }

    public double surfaceArea(){
        return ((2 * pie) * (radius * radius)) + ((2 * pie) * (radius * height)) ;
    }

    public double volume(){
        return pie * (radius * radius) * height;
    }

    public void displayDetails(){
        System.out.printf("\nHeight of Cylinder %s : %d\n",CylinderName ,height);
        System.out.printf("Radius of Cylinder %s: %d\n",CylinderName, radius);
        System.out.printf("SurfaceArea of Cylinder %s: %.2f\n",CylinderName,  surfaceArea());
        System.out.printf("Volume of Cylinder %s: %.2f\n",CylinderName,  volume());
    }
    
}

class sphere{
    private int radius;
    double pi = 3.14;
    public sphere(int r){
        radius = r;
    }

    public int sphere(){
        return radius = 0;
    }

    public int sphere(int r){
        return radius = r;
    }

    public double volume(){
        return (4/3) * pi * (radius * radius * radius);
    }

    public double surfaceArea(){
        return 4 * pi * (radius * radius);
    }

    public void displayDetails(){
        System.out.printf("\nRadius of sphere: %d ", radius);
        System.out.printf("\nVolume of sphere: %.2f", volume());
        System.out.printf("\nSurfaceArea of sphere: %.2f \n", surfaceArea());
    }
}

class practiceset{
     public static void main(String[] args) {
        cylinder c1 = new cylinder();
        
        c1.setHeight(10);
        c1.setRadius(5);

        System.out.printf("\nHeight of Cylinder c1: %d\n", c1.getHeight());
        System.out.printf("Radius of Cylinder c1: %d\n", c1.getRadius());
        System.out.printf("SurfaceArea of Cylinder c1: %.2f \n", c1.surfaceArea());
        System.out.printf("Volume of Cylinder c1: %.2f\n",c1.volume());

        cylinder c2 = new cylinder(5, 12, "Cylinder 2");
        c2.displayDetails();


        sphere s1 = new sphere(6);
        s1.displayDetails();
    }
}