import java.util.*;
class MarkOutofBounds extends Exception
{  
	String ex;
	MarkOutofBounds(String exc)
	{
		ex=exc;
	}
}
class studentinfo
{
    private String name,grade;
    private int rollno;
    private float per,tot;
    private int m[]=new int[3];
    public void getinfo()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name : ");
        name=s.next();
        System.out.println("Enter the Rollno : ");
        rollno=s.nextInt();
        try 
        {
            System.out.println("Enter the Marks in 3 subjects : ");
            for(int i=0;i<3;i++)
            {
                m[i]=s.nextInt();
                if(m[i]<0 || m[i] >100)
                throw new MarkOutofBounds(m[i] + " is invalid it should be between 0-100");
            }
	    for(int i=0;i<3;i++)
	    {
	        tot=tot+m[i];
	    }
            per=tot/3;
        if(per>80)
        	grade="A";
    	else if(per>75)
        	grade="B";
    	else if(per>60)
        	grade="C";
    	else if(per>50)
        	grade="D";
    	else if(per>35)
	        grade="E";
	    else
        	grade="F";
         System.out.println("----------STUDENT INFO---------------");
         System.out.println("Roll number:" +rollno);
         System.out.println("Student Name:" +name);
         System.out.println("Marks in  3 subjects:");
         for(int i=0;i<3;i++)
         {
        	System.out.println(m[i]);
         }
         System.out.println("Total:" +tot);
         System.out.println("Percentage:" +per);
         System.out.println("Grade:" +grade);
        }
        catch(MarkOutofBounds e)
		{
			System.out.println(e.ex);
		}
        catch(Exception ex)
        {
	    	System.out.println("Invalid Marks ! Enter in Number Format ");
	    }
   }
}
class empExep
{
    public static void main(String[] args)
    {
	    studentinfo s=new studentinfo();
    	s.getinfo();
    }
}