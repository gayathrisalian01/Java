import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements ? ");
		int n=sc.nextInt();
		System.out.println("Input "+n+" integers");
		int arr[]=new int[25];
		int reversearray[]=new int[25];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int result=0;
			for(int j=arr[i];j!=0;j=j/10)
			{
				result=result*10+j%10;
			}
			reversearray[i]=result;
			System.out.println(arr[i]+"        "+reversearray[i]);
		}
	}
}


