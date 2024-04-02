import java.util.Scanner;
class demo
{
	public static void main(String args[])
	{
		System.out.println("Enter 3 values");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a=sc.nextInt();
		System.out.println("Enter 2nd value");
		int b=sc.nextInt();
		System.out.println("Enter 3rd value");
		int c=sc.nextInt();
		int total=a+b+c;
		System.out.println("Total is "+total);

	}
}