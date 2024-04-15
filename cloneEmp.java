import java.util.*;
class employee implements Cloneable
{
private int id;
float salary;
String name,des;
Scanner sc=new Scanner(System.in);
public employee clone() throws CloneNotSupportedException
{
	employee cloned=(employee)super.clone();
return cloned;
}


public void input()
{

System.out.println("Enter the name");
name=sc.next();
System.out.println("Enter the id");
id=sc.nextInt();
System.out.println("Enter the Designation");
des=sc.next();
System.out.println("Enter the Salary");
salary=sc.nextInt();
}
public void display()
{
System.out.println("Name" +name);
System.out.println("Id " +id);
System.out.println("Designation "+des);
System.out.println("Salary "+salary);

}
}
class cloneEmp {
    public static void main(String args[]) {
        employee e = new employee();
        employee e2;
        e.input();
        e.display();
        try {
            e2 = e.clone();
            e2.input();
            e2.display();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
