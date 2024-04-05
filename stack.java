import java.util.*;
class stack
{
	static class Stack
	{
	   static int s[]=new int[10];
	   static int top=-1;

	public static void push(int data)
	{
		if(top==4)
		{
			System.out.println("Stack is full");
			return;
		}
		top++;
		s[top]=data;
	}
	public static int pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return -1;
		}
		int val=s[top];
		top--;
		return val;
	}
	void display()
	{
		for(int i=0;i<=top;i++)
		   System.out.print(s[i]+"\t");
		System.out.println();
	}
}
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		while(true)
		{
			System.out.println("------------------------------------------");
			System.out.println("1.push\n2.pop\n3.display\n4.exit\nEnter your choice:");
			a=sc.nextInt();
			switch(a)
			{
				case 1:
					   System.out.print("Enter element:" );
				       int e=sc.nextInt();
				       s.push(e);
				       break;
				case 2:
					   System.out.println(s.pop()+"is popped");
					   break;
				case 3:
					   s.display();
					   break;
				case 4:
					   break ;
				default:
					  System.out.println("invalid");
			}
		}
	}
}