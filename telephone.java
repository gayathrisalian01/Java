import java.util.*;
class customer
{
	private int cust_id,billno,no_of_calls,n;
	private String name;
	private double bill_amount,phno;
	Scanner sc=new Scanner(System.in);
	customer()
	{
		bill_amount=0;
		read();
	}
	public void read()
	{
			System.out.print("Enter the customer id:");
			cust_id=sc.nextInt();
			System.out.print("Enter the customer name:");
			name=sc.next();
			System.out.print("Enter the phno:");
			phno=sc.nextDouble();
			System.out.print("Enter the billno:");
			billno=sc.nextInt();
			System.out.print("Enter the number calls:");
			no_of_calls=sc.nextInt();
	}
	public double bill_amt()
	{
		if(no_of_calls==0)
		bill_amount=0;
		else if(no_of_calls<=100)
			bill_amount=100;
		else if(no_of_calls<=150)
			bill_amount=100+0.6;
		else if(no_of_calls<=200)
			bill_amount=100+0.6+0.5;
		else
			bill_amount=100+0.6+0.5+0.4;
		return bill_amount;
	}
	public void display()
	{
		System.out.print("\n-------------Telephone Bill Details-----------------------------\n");
		System.out.println("\nCustomer ID:"+cust_id+"\nCustomer Name:"+name+"\nPhone Number:"+phno+
							"\nBill Number:"+billno+"\nNumber of calls:"+no_of_calls+"\nTotal Bill Amount:"
							+bill_amt());
	}
}
class telephone
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customer:");
		int n=sc.nextInt();
		customer cust[] =new customer[n];
		for(int i=0;i<n;i++)
		{
			cust[i]=new customer();
		}
		for(customer c:cust)
		{
			c.display();
		}

	}
}