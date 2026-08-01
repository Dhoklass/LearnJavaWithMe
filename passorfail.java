import java.util.Scanner;
class passorfail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.println("Enter marks for subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.println("Enter marks for subject 3: ");
        double subject3 = sc.nextDouble();
        
        double percentage = (((subject1 + subject2 + subject3)/300) * 100);

        if(subject1 >= 33 && subject2 >= 33 && subject3 >= 33 && percentage >= 40){
            System.out.println("Congratulations! you have passed!");
        }

        else{
            System.out.println("Sorry you have failed!");
        }

        if(subject1 < 33){
            System.out.println("you have failed in subject1!");
        }

        if(subject2 < 33){
            System.out.println("you have failed in subject1!");
        }

        if(subject3 < 33){
            System.out.println("you have failed in subject1!");
        }
    }
}