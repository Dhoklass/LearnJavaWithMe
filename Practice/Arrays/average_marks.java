import java.util.Scanner;
class average_marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of students to store marks of in array: ");
        int x = sc.nextInt();
        int [] physics_marks = new int[x];

        for(int i=0;i<x;i++){
            System.out.printf("Enter marks for student %d: ",i+1);
            physics_marks[i] = sc.nextInt();
        }

        for(int i=0;i<x;i++){
            System.out.printf("marks of student %d is %d \n",i+1,physics_marks[i]);
        }
    }
}