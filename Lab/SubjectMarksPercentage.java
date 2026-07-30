import java.util.Scanner;
class SubjectMarksPercentage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for English: ");
        double English = sc.nextDouble();
        if(English > 100 || English < 0){
            System.out.println("Invalid marks!! please enter marks between 0 and 100.");
            return;
        }

        System.out.println("Enter marks for Hindi: ");
        double Hindi = sc.nextInt();
        if(Hindi > 100 || Hindi < 0){
            System.out.println("Invalid marks!! please enter marks between 0 and 100.");
            return;
        }

        System.out.println("Enter marks for Maths: ");
        double Maths = sc.nextInt();
        if(Maths > 100 || Maths < 0){
            System.out.println("Invalid marks!! please enter marks between 0 and 100.");
            return;
        }

        System.out.println("Enter marks for Science: ");
        double Science = sc.nextInt();
        if(Science > 100 || Science < 0){
            System.out.println("Invalid marks!! please enter marks between 0 and 100.");
            return;
        }

        System.out.println("Enter marks for SST: ");
        double SST = sc.nextInt();
        if(SST > 100 || SST < 0){
            System.out.println("Invalid marks!! please enter marks between 0 and 100.");
            return;
        }

        double percentage = (((English + Hindi + Maths + Science + SST)/500)*100);
        System.out.printf("Total percentage of 5 subjects is: %.2f%%", percentage);

        
    }
}