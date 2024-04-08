import java.util.*;

class student
{
	Scanner sc=new Scanner(System.in);
	int regno,sem;
	String name,course;
	void getdata()
	{
		System.out.println("Enter the following details of the student");
		System.out.println("Register number, Name, Course, Semester");
		regno=sc.nextInt();
		name=sc.next();
		course=sc.next();
		sem=sc.nextInt();
	}
	void display()
	{
		System.out.println("Student basic detail--student base class");
		System.out.println("Register number"+regno);
		System.out.println("Name"+name);
		System.out.println("Course"+course);
		System.out.println("Semester"+sem);
	}

}

class exam extends student
{
	Scanner sc=new Scanner(System.in);
	int m1,m2,m3;
	void getdata()
	{
			super.getdata();
			System.out.println("Mark1, Mark2, Mark3");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
	}
	void display()
	{
		super.display();
			System.out.println("Student Marks--Exam base class");
			System.out.println("Mark1 :"+m1);
			System.out.println("Mark2 :"+m2);
			System.out.println("Mark3 :"+m3);
	}
}
class result extends exam
{
		int total=0;
		String g="";
		void getdata()
		{
			super.getdata();
			total=m1+m2+m3;

			double percent=(total*100)/300;
			if(super.m1<35||super.m2<35||super.m3<35)
									{
										g="Fail";
									}

									else if(percent<35&&percent>=0)
									{
										g="F";
									}
									else if(percent>=35&&percent<45)
									{
										g="E";
									}
									else if(percent>=45&&percent<65)
									{
										g="D";
									}
									else if(percent>=65&&percent<75)
									{
										g="C";
									}
									else if(percent>=75&&percent<85)
									{
										g="B";
									}
									else if(percent>=85&&percent<=100)
									{
										g="A";
									}
									else
									{
										System.out.println("Invalid marks");
									}

		}



		void display()
		{
				super.display();
				System.out.println("RESULT--result subclass");
				if(total>=0)
				{
					System.out.println("Total"+total);
					System.out.println("Grade"+g);
				}
				else
				{
					System.out.println("Invalid marks");
				}

}

}


class studentres{
public static void main(String args[])
{
	result r=new result();
	r.getdata();
	r.display();

}
}
