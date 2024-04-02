import java.util.Scanner;
public class amount
{
 public static void main(String[] args)
 {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter loan amount:");
	double loanAmount = s.nextDouble();
	System.out.print("Enter number of years: ");
	int numberOfYears = s.nextInt();
	double annualInterestRate = 5.0;
	System.out.println("Interest Rate\t\t"+ "Monthly Payment\t\t" + "Total Payment");
	while (annualInterestRate <= 8.0)
	
	{
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment= loanAmount * monthlyInterestRate/
		(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println(annualInterestRate+"%\t\t\t"+Math.round(monthlyPayment*100.0)/100.0+"\t\t\t"+Math.round(totalPayment*100.0)/100.0);
		annualInterestRate = annualInterestRate + 1.0 / 8;
    }
  }
}