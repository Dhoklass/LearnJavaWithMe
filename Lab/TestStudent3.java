class student{
    int id;
    String name;
}

class TestStudent3{
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student();

        s1.id = 101;
        s1.name = "Ram";
        s2.id = 102;
        s2.name = "Sham";

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}