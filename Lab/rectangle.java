class rect{
    int length;
    int breadth;
    void insertRecord(int l, int b){
        length = l;
        breadth = b;
    }

    int findArea(){
        return length * breadth;
    }

    int findPerimeter() {
        return 2 * (length + breadth);
    }

    void displayInfo(){
        System.out.println("length: " + length + ", breadth: " + breadth);
        System.out.println("Area of rectangle: " + findArea());
        System.out.println("Perimeter of rectangle: " + findPerimeter());
    }

    
}

class rectangle{
    public static void main(String[] args) {
        rect r1 = new rect();
        r1.insertRecord(5, 10);
        r1.displayInfo();
    }
}   