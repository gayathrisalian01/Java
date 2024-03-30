import java.util.*;
class pay
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of hours worked :");
		int hrs=sc.nextInt();
		System.out.println("Enter the hourly rate :");
		float rate=sc.nextFloat();
		double newpay;
		if(hrs>=40)
		{
			newpay=(40*rate)+((hrs-40)*(rate*1.5));
			System.out.println("The total pay = "+newpay);
		}
		else
		System.out.println("The total pay = "+(hrs*rate));
	}
}


