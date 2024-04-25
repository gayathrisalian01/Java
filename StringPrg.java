import java.util.Scanner;
class StringPrg{
	static void getData(String s1,String s2,String sub,int n1,int n2){


		String upper="",lower="",substr="";
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isUpperCase(s1.charAt(i)))
				upper+=s1.charAt(i);
		}

		for(int i=0;i<s2.length();i++)
		{
			if(Character.isLowerCase(s2.charAt(i)))
				lower+=s2.charAt(i);
		}

	substr=s1.substring(n1,n2);
	//s1.insert(sub,n1);
	String conRes=s1.concat(s2);
	System.out.println("Upper case letters"+upper);
	System.out.println("Lowercase letters"+lower);
	System.out.println("Substring is:"+substr);
	System.out.println("After inserting:"+s1);
	System.out.println("After Appending:"+conRes);

}

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String 1:");
	String s1=sc.next();
	System.out.println("Enter String 2:");
	String s2=sc.next();
	System.out.println("Enter String 3 to append:");
	String sub=sc.next();
	System.out.println("Enter start index:");
	int n1=sc.nextInt();
	System.out.println("Enter end index:");
	int n2=sc.nextInt();

	getData(s1,s2,sub,n1,n2);
}
}