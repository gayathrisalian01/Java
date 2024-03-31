import java.util.*;
class fuel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance(in Km) : ");
		double dist=sc.nextFloat();
		System.out.print("Enter the fuel consumed(in Litre) : ");
		double fuel=sc.nextFloat();
		double avgfuel=dist/fuel;
		int ch;
		System.out.println("Average fuel economy= "+avgfuel+" kmpl");
		do
		{
			System.out.println("1.Dist estimation");
			System.out.println("2.Fuel estimation");
			System.out.println("Enter your choice(0 to stop):");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("Enter the fuel consumed(in Litre)");
						double fuelnew=sc.nextFloat();
						double newdist=avgfuel*fuelnew;
						System.out.println("Estimated distance = "+newdist);
						break;
				case 2:
						System.out.println("Enter the distance(in km) : ");
						double distnew=sc.nextFloat();
						double newfuel=distnew/avgfuel;
						System.out.println("Estimated fuel = "+newfuel);
						break;
			}
		}
		while(ch!=0);
	}
}





