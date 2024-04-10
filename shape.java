import java.util.*;
abstract class figure
{
	public int dim1,dim2;
	abstract void area();

}
class rect extends figure
	{
		int wid,hgt;
		double area=0.0;
		rect(int w,int h)
		{
			wid=w;
			hgt=h;
		}
		void area()
		{
			area=wid*hgt;
			System.out.println("Area of Rectangle "+area);
		}
	}

class tri extends figure
	{
		int base,hgt;
		double area=0.0;
		tri(int b,int h)
		{
			base=b;
			hgt=h;
		}
		void area()
		{
			area=0.5*(base*hgt);
			System.out.println("Area of Rectangle "+area);
		}
	}

class square extends figure
	{
		int side;
		double area=0.0;
		square(int s)
		{
			side=s;
		}
		void area()
		{
			area=side*side;
			System.out.println("Area of Square "+area);
		}
	}
class shape{
	public static void main(String args[])
	{
		int w,hrect,htri,b,s;
		Scanner sc=new Scanner(System.in);
		figure f;
		System.out.println("Enter the width and height of the rectangle");
		w=sc.nextInt();
		hrect=sc.nextInt();

		f=new rect(w,hrect);

		f.area();

		System.out.println("Enter the base and height of the triangle");
		b=sc.nextInt();
		htri=sc.nextInt();

		f=new tri(w,htri);
		f.area();

		System.out.println("Enter the width and height of the square");
		s=sc.nextInt();

		f=new square(s);
		f.area();

	}
}