import java.util.Scanner;
class MyThread extends Thread
{
 	int Thread_num;
 	static int sum=0,sum2,sum3;
	int a[][]=new int[3][3];
	MyThread(int b[][],int num)
	{
		a=b.clone();
		Thread_num=num;
		this.start();

	}
	public void run()
	{
		if(Thread_num==1)
		{
			for(int j=0;j<3;j++)
			{
				sum=sum+a[0][j];

			}
				System.out.println("1st row sum is done"+" "+sum);

		}
		if(Thread_num==2)
		{
			for(int j=0;j<3;j++)
			{
					sum=sum+a[1][j];
					sum2=sum2+a[1][j];
			}
				System.out.println("2nd row sum is done"+" "+sum2);

		}
		if(Thread_num==3)
				{
					for(int j=0;j<3;j++)
					{
						sum=sum+a[2][j];
                        sum3=sum3+a[2][j];
					}
					System.out.println("3rd row sum is done"+" "+sum3);

	    System.out.println("Sum of elements is "+sum);
		}
	}
}
class multithread
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
					for(int i=0;i<3;i++)
					{
						for(int j=0;j<3;j++)
					{
						a[i][j]=sc.nextInt();
			}
		}
		try
		{
		    MyThread m1=new MyThread(a,1);
		    m1.join();
		    MyThread m2=new MyThread(a,2);
		    m2.join();
		    MyThread m3=new MyThread(a,3);
		    m3.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("Interrupted.."+e);
		}
	}
}