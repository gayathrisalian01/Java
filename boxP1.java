import java.util.*;
class box
{
		double length=0,width=0,height=0,volume=0;
		public box(double l,double w,double h)
		{
			length=l;
			width=w;
			height=h;
		}
		public void volume()
		{
			volume=length*width*height;
			System.out.print("Volume ="+volume);

		}
	}
	class additional extends box
	{
		double weight=0;
		String color="";
	    public additional(double l,double w,double h,double wgt,String clr)
		{
			super(l,w,h);
			weight=wgt;
			color=clr;
		}
		public void display()
		{
			System.out.print("Length ="+length);
			System.out.print("Width ="+width);
			System.out.print("Height ="+height);
			super.volume();
			System.out.print("Weight ="+weight);
			System.out.print("Color ="+color);
		}
	}
	class boxP1
	{
		public static void main(String args[])
		{

			double len,wid,hgt,wgt;
			String colr;
			Scanner sc=new Scanner(System.in);
			System.out.println("Length, Width, Height, Weight and color ?");
			len=sc.nextDouble();
			wid=sc.nextDouble();
			hgt=sc.nextDouble();
			wgt=sc.nextDouble();
			colr=sc.next();
			additional b=new additional(len,wid,hgt,wgt,colr);
			b.display();
		}
	}

