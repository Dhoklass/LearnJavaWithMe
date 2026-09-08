class array_object{
    public static void main(String[] args){
        // staff s1 = new staff('yash','12-06-2005',"manager",25000);
        // staff s2 = new staff('anay','25-08-2006',"client",35000);
        // s1.display();

        staff[] staffs = new staff[2];
        staffs[0] = new staff("yash","12-06-2005","manager",25000);
        staffs[1] = new staff("anay","25-08-2006","client",35000);

        for(staff s: staffs){
            s.display();
        }

    

    }
}


class staff{
    String name;
    String birth_date;
    String designation;
    int salary;

    staff(String name,String birth_date,String designation, int salary){
        this.name = name;
        this.birth_date = birth_date;
        this.designation = designation;
        this.salary = salary;
    }

    void display(){
        System.out.printf("name: %s\n",name);
        System.out.printf("birth_date: %s\n",birth_date);
        System.out.printf("designation: %s\n",designation);
        System.out.printf("salary: %d\n",salary);
    }
}

