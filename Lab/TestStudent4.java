class student{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno = r;
        name = n;
    }
    void displayInfo(){
        System.out.println(rollno + " " + name);
    }
}

class TestStudent4{
    public static void main(String[] args) {
        student s1 = new student();
        s1.insertRecord(101, "Ram");
        s1.displayInfo();
    }
}   