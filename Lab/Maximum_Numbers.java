import java.util.Scanner;
class Maximum_Numbers{

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number1:");
	int num1 = input.nextInt();

	System.out.print("Enter the number2:");
	int num2 = input.nextInt();

	System.out.print("Enter the number3:");
	int num3 = input.nextInt();

	if(num1>num2 && num1 > num3)
		System.out.println("Maximum no is" + num1);
	else if(num2>num1 && num2>num3)
		System.out.println("Maximum no is" + num2);
	else
		System.out.println("Maximum no is" + num3);
}
}

