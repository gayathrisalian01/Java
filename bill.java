import java.util.*;
class shop
{
	double bill,unitprice,discamt=0,payment=0;
	int quantity,itemid;
	String name;
	Scanner sc=new Scanner(System.in);
	void inputdata()
	{
			System.out.println("Enter item id");
			itemid=sc.nextInt();
			System.out.println("Enter the item name");
			name=sc.next0();
			System.out.println("Enter the quantity");
			quantity=sc.nextInt();
			System.out.println("Enter unit price");
			unitprice=sc.nextDouble();
			bill=quantity*unitprice;
	}
	void discount()
	{
		if(bill<500)
		{
			System.out.println("No discount");
			discamt=0;
		}
		else if(bill>=500&&bill<=1000)
		{
			discamt=bill*0.10;
			System.out.println("Your discount amount is"+discamt);
		}
		else if(bill>=1000&&bill<=2000)
		{
					discamt=bill*0.12;
					System.out.println("Your discount amount is"+discamt);
		}
		else if(bill>2000)
		{
			discamt=bill*0.15;
			System.out.println("Your discount amount is"+discamt);

		}
	}
	void display()
	{
				 System.out.println("ItemId\t\t"+itemid+"\nItem Name\t\t"+name+"\nQuantity\t\t"+quantity+"\nUnit Price\t\t"+unitprice+"\nBill\t\t"+bill);
				 payment=bill-discamt;
				 System.out.println("The amount to be paid is"+payment);
	}

}
class bill
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 shop myshop=new shop();
	 int ch;
	do
	{
		System.out.println("1.Input data");
		System.out.println("2.See the discount amount");
		System.out.println("3.Display data");
		System.out.println("Enter the choice(0 to stop)");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				myshop.inputdata();
				break;
			case 2:
				myshop.discount();
				break;
			case 3:
				myshop.display();
				break;
		}

	}while(ch!=0);
}
}


