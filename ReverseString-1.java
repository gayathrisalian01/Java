import java.util.Scanner;



class ReverseString{

	public  static void reverse(String s ){
			String res="";
			for(int i=s.length();i>0;i--)
			{
				res+=s.charAt(i-1);

			}

			System.out.println(res);
			if(s.equals(res))
					System.out.println("Palindrome..");
			else
					System.out.println("Not a paindrome..");

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String  in;
		System.out.println("Enter a string :");
		in=sc.next();
		reverse(in);
		}
}