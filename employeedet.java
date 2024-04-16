import java.util.*;
class employee
{
	int empno, age;
	String name, desig;
	double salary;
	employee(int no,String nam,int ag,String design,double sal)
	{
		empno=no;
		name=nam;
		desig=design;
		age=ag;
		salary=sal;

	}
	void display()
	{
		System.out.println("Employee Number "+empno+"\nName "+name+"\nAge "+age+"\nDesignation "+desig+"\nSalary "+salary);

	}
	int getId(){
		return empno;
	}
}
class employeedet{
	public static void main(String args[])
	{
		int empno, age;
		String name, desig;
		double salary;
		int ch;
		employee e;
		Scanner sc=new Scanner(System.in);
		ArrayList<employee> al = new ArrayList<employee>();

		do {	System.out.println("<---Menu--->");
				System.out.println("1. Insert an object into the arraylist");
				System.out.println("2. Display the contents of the arraylist.");
				System.out.println("3. Delete an object from the arraylist");
				System.out.println("Enter your choice ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
							System.out.println("Enter the details of Employee");
							System.out.println("Enter Employee number");
							empno=sc.nextInt();
							System.out.println("Enter Employee name");
							name=sc.next();
							System.out.println("Enter Employee age");
							age=sc.nextInt();
							System.out.println("Enter Employee Designation");
							desig=sc.next();
							System.out.println("Enter Employee Salary");
							salary=sc.nextDouble();
							al.add(new employee(empno,name,age,desig,salary));
							break;
					case 2:
 								Iterator<employee> itr = al.iterator();
								 while(itr.hasNext()) {
									 employee em;
								 	 em= itr.next();
								 	 em.display();
								 	}
 								break;
 					case 3:
 							System.out.println("Enter the id of employee");
 							int id=sc.nextInt();
 							Iterator<employee> itr1 = al.iterator();
							 while(itr1.hasNext()) {
								 employee em;
								 em= itr1.next();
								 if(em.getId()==id)
								 {
									 al.remove(em);
									 break;
								 }
								}
 								break;
 							default:
 							System.out.println("Invalid choice");
 							break;
						}
					}while(ch!=0);


	}
}