package sout.f.f2.f3;

import java.util.Scanner;

class sout{
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("by using sout");
    }
}

class q2{
    public static void main(String[] args) {
        sout s1 = new sout();
        s1.display();
    }
}