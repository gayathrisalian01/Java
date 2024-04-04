import java.util.*;
class boxVolume{
public static void main(String args[])
{
	double width,height,depth;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the width of a box:");
	width=sc.nextDouble();
	System.out.println("Enter the height of a box:");
	height=sc.nextDouble();
	System.out.println("Enter the depth of a box:");
	depth=sc.nextDouble();
	box b=new box(width,height,depth);
	double vol=b.volume();
	System.out.println("volume of the box is"+vol);

}
}
class box{
	double w,h,d;
	public box(double wi,double he,double de)
	{
		w=wi;
		h=he;
		d=de;
	}
	double volume()
	{
		return w*h*d;
	}
}
