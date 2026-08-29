class base{
    int id;
    String name;

    public base(int id, String name){
        this.id = id;
        this.name = name;
    }

    public base(){
        id = 0;
        name = "your name here";
    }

    public int setid(int n){
        return id = n;
    }

    public String setname(String n){
        return name = n;
    }

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public void displayDetails(){
        System.out.println("\nname: " + name);
        System.out.println("id: " + id);
    }

    }

class derived extends base{
    int age;
    int salary;

    public derived(String name, int id, int age, int salary){
        super(id, name);
        this.age = age;
        this.salary = salary;
    }

    public derived(){
        age = 0;
        salary = 0;
    }

    public int setage(int n){
        return age = n;
    }
    
    public int setsalary(int n){
        return salary = n;
    }

    public int getage(){
        return age;
    }

    public int getsalary(){
        return salary;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
    }



}
//single inheritance - class derived extends base

class derived2 extends derived{
    String phoneNo;

    derived2(String name, int id, int age, int salary, String phoneNo){
        super(name, id, age, salary);
        this.phoneNo = phoneNo;
    }

    public derived2() {
        phoneNo = "0";
    }

    

    public void displayDetails(){
        super.displayDetails();
        System.out.println("phone no: " + phoneNo);
    }
}

class constructors{
    public static void main(String[] args) {
        derived d1 = new derived();
        d1.setname("Yash");
        d1.setage(21);
        d1.setid(101);
        d1.setsalary(21000);

        System.out.println(d1.getname());
        System.out.println(d1.getage());
        System.out.println(d1.getid());
        System.out.println(d1.getsalary());

        derived d2 = new derived("Harsh", 101, 21, 22000);
        d2.displayDetails();

        derived2 dd2 = new derived2("Darshan", 103, 22, 25000, "851 935 5636");
        dd2.displayDetails();
    }
}