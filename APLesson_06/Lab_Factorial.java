import java.util.Scanner;
public class Lab_Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = kb.nextInt();
		int factorial = 1;
		
		for(int i = 1; i <= n; i++)
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}