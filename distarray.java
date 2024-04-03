import java.util.Scanner;
class distarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		System.out.print("Input ");
		int a[]= new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					System.out.print("("+a[i]+","+a[j]+")");
				}
			}

		}
	}
}