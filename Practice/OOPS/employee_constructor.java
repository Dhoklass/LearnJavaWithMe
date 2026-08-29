class myMainEmployee{
    private int id;
    private int salary;
    private String name;
    
    public myMainEmployee(int id,int salary, String name){     //constructor
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public myMainEmployee(){
        id = 00;
        salary = 10000;
        name = "your-name-here";

    }

    public void displayDetails(){       //display details using e1.displayDetails();
        System.out.println("id: " + id);
        System.out.println("salary: " + salary);
        System.out.println("name: " + name + "\n");
    }

    public int setID(int n){    //setter for id
        return id = n;
    }

    public int setSalary(int n){    //setter for salary
        return salary = n;
    }
    
    public String setName(String n){       //setter for name
        return name = n;
    }

    public int getId(){     //getter for id
        return id;
    }

    public int getSalary(){     //getter for salary
        return salary;
    }

    public String getName(){    //getter for name
        return name;
    }


}


class employee_constructor{    
    public static void main(String[] args) {
        // myMainEmployee e1 = new myMainEmployee(); 

        // e1.id = 101;    //displays error because id is private and cannot be changed without using a method which is changing or setting the id!
        // e1.setID(101);

        // e1.name = "Yash";   //same as above!
        // e1.setName("Yash");   

        // System.out.println("Id: " + e1.getId());    //printing the id 
        // System.out.println("Name: " + e1.getName());    //printing the name

        myMainEmployee e1 = new myMainEmployee(101,16500, "Aryan");   //calling the constructor
        myMainEmployee e2 = new myMainEmployee(102, 25000, "Yash");

        myMainEmployee e3 = new myMainEmployee();   //no values provided, uses the default constructor

        e1.displayDetails();    // displaying details
        e2.displayDetails();
        e3.displayDetails();
        
    }
}