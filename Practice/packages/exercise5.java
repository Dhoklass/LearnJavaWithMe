/*
You have to create a package named com.codewithharry.shape
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area and getters/setters for dimensions
*/

//package com.cwy.shape;
import java.util.Scanner;

class Rectangle{
    Scanner sc = new Scanner(System.in);
    int len;
    int bred;
    void set_length(){
        System.out.println("Enter Length of Rectangle: ");
        int l = sc.nextInt();
        len = l;
    }

    void set_breadth(){
        System.out.println("Enter Breadth of Rectangle: ");
        int b = sc.nextInt();
        bred = b;
    }

    int get_length(){
        return len;
    }

    int get_breadth(){
        return bred;
    }

    int area(){
        return len * bred;
    }
}

class Square extends Rectangle{
    int side;
    void set_side(){
        System.out.println("Enter Side of Square: ");
        int s = sc.nextInt();
        side = s;
    }

    int get_side(){
        return side;
    }

    @Override
    int area(){
        return side * side;
    }
}

class Circle{
    Scanner sc = new Scanner(System.in);
    double pi = 3.14;
    int radius;

    void set_radius(){
        int r = sc.nextInt();
        radius = r;
    }

    double area(){
        return pi * radius * radius;
    }

}

class Cylinder extends Circle{
    int height;

    @Override
    void set_radius(){
        super.set_radius();
    }

    void set_height(){
        int h = sc.nextInt();
        height = h;
    }

    double volume(){
        return pi * radius * radius * height;
    }

    @Override
    double area(){
        return 2 * pi * radius * (radius + height);
    }
    
    
}

class Sphere extends Cylinder{
    @Override
    void set_radius(){
        super.set_radius();
    }
    
    @Override
    double volume(){
        return 1.3 * pi * radius * radius * radius;
    }

    @Override
    double area(){
        return 4 * p i * radius * radius;
    }
}

class shapes{
    Scanner sc = new Scanner(System.in);
    
    void shape(){
        System.out.println("-------------------------\nShapes Simulator\n-------------------------");
        System.out.println("1.Rectangle\n2.Square\n3.Circle\n4.Cylinder\n5.Sphere\n6.Exit");
    
        while (true) { 
            System.out.println("Enter a choice: ");
            int num = sc.nextInt();
            
            switch (num){
                case 1:
                    Rectangle r1 = new Rectangle();
                    r1.set_length();
                    r1.set_breadth();
                    System.out.println("Area of Rectangle: " + r1.area() + "\n");
                    break;

                case 2:
                    Square s1 = new Square();
                    s1.set_side();
                    System.out.println("Area of Square: " + s1.area() + "\n");
                    break;
                
                case 3:
                    Circle c1 = new Circle();
                    System.out.println("Enter Radius of Circle: ");
                    c1.set_radius();
                    System.out.println("Area of Circle: " + c1.area() + "\n");
                    break;
                
                case 4:
                    Cylinder cd1 = new Cylinder();
                    System.out.println("Enter Radius of Cylinder: ");
                    cd1.set_radius();
                    System.out.println("Enter Height of Cylinder");
                    cd1.set_height();
                    System.out.println("Volume of Cylinder: " + cd1.volume());
                    System.out.println("Area of Cylinder: " + cd1.area() + "\n");

                    break;
                case 5:
                    Sphere sp1 = new Sphere();
                    System.out.println("Enter Radius of Sphere: ");
                    sp1.set_radius();
                    System.out.println("Volume of Sphere: " + sp1.volume());
                    System.out.println("Area of Sphere: " + sp1.area() + "\n");
                    break;
                case 6:
                    System.out.println("Thanks for using Shapes Simulator!");
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }
}

class exercise5{
    public static void main(String[] args) {
        // Rectangle r1 = new Rectangle();
        // r1.set_length();
        // r1.set_breadth();
        //System.out.println(r1.get_length());
        //System.out.println("Area of Rectangle r1: " + r1.area());

        shapes s1 = new shapes();
        s1.shape();
    }
}