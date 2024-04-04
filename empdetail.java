import java.util.*;
class employee
{
	double basic,hra,it=200,pf=0,net=0,gross=0;
	int code;
	String name;
	Scanner sc=new Scanner(System.in);
	void inputdata()
	{
		System.out.println("Enter the Employee code");
		code=sc.nextInt();
		System.out.println("Enter the employee name");
		name=sc.next();
		System.out.println("Enter the Basic salary");
		basic=sc.nextDouble();
	}
	void calculation()
	{
		hra=basic*0.075;
		pf=basic*0.12;
		gross=basic+hra;
		net=gross-(it+pf);
	}
	void display()
	{
		System.out.println("Employee Information");
		System.out.println("Employee Code\t\t"+code+"\nEmployee Name\t\t"+name+"\nNet Salary\t\t"+net);
	}
}


class empdetail
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		employee emp=new employee();
		int ch;
		do
		{
			System.out.println("\t1.Input the employee details");
			System.out.println("\t2.Display employee data");
			System.out.println("Enter your choice(0 to stop)");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					emp.inputdata();
					break;
				case 2:
					emp.calculation();
					emp.display();
					break;
			}
		} while(ch!=0);
}

}