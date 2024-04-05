import java.util.*;
class points{

	int xcor,ycor;
	double dis;
	points(int x,int y)
	{
		xcor=x;
		ycor=y;
	}
	void display()
   {
		System.out.print("("+xcor+", "+ycor+")");
   }
   void calculate(int m,int n)
   {
	int x= m-xcor;
	int y=n-ycor;
	dis=Math.sqrt(x*x+y*y);
	System.out.println("\nDistance between P1 and P2 is: "+dis);
   }
   void calculate(points p)
	{
		int x= xcor-p.xcor;
		int y=ycor-p.ycor;
		dis=Math.sqrt(x*x+y*y);
	    System.out.println("Distance between P1 and P3 is: "+dis);
	}
}
class distancepoints{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p1xcor,p1ycor,p2xcor,p2ycor,p3xcor,p3ycor;
		System.out.println("Input the coordinates of p1 : ");
		p1xcor=sc.nextInt();
		p1ycor=sc.nextInt();
		points p1=new points(p1xcor,p1ycor);

		System.out.println("Input the coordinates of p2 : ");
		p2xcor=sc.nextInt();
		p2ycor=sc.nextInt();
		points p2=new points(p2xcor,p2ycor);

		System.out.println("Input the coordinates of p3 : ");
		p3xcor=sc.nextInt();
		p3ycor=sc.nextInt();
		points p3=new points(p3xcor,p3ycor);

		System.out.print("P1: ");
		p1.display();
		System.out.print("\nP2: ");
		p2.display();
		System.out.print("\nP3: ");
	    p3.display();

		p1.calculate(p2xcor,p2ycor);
		p1.calculate(p3);


	}
}