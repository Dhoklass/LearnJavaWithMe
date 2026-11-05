import java.util.Scanner;

class NegRad extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative!";
    }

    @Override
        public String getMessage(){
            return "Radius cannot be negative!";
        }
}

class NegativeRadius{
    public static double area(int r) throws NegRad{
        if(r<0){
            throw new NegRad();
        }
        double result = Math.PI * r * r;
        return result;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Radius to find Area of Circle: ");
            int r = sc.nextInt();
            System.out.printf("Area of Circle with Radius %d is %.2f", r, area(r));
                } catch (NegRad e) {
            System.out.println("NegativeRadiusException Occured!" + e);
        }
    }
}