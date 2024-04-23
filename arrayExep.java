import java.util.*;
class ArrayException
{
    private int arr1[]=new int[4];
    private int arr2[]=new int[5];
    public void getdata()
    {
        try
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Elements of array1");
            for(int i=0;i<arr1.length;i++)
            arr1[i]=s.nextInt();
            System.out.println("Enter the Elements of array2");
            for(int i=0;i<arr2.length;i++)
            arr2[i]=s.nextInt();
            System.out.println("Array elemnts after division");
        	for(int i=0;i<arr2.length;i++)
	        {
	        	System.out.println(arr1[i]/arr2[i]);
    	    }
        }   
        catch(ArithmeticException e)
        {
        	System.out.println("Divide by Zero error" );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
    	    System.out.println("Index out of bound error" );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class arrayExep
{
	public static void main(String args[])
	{
		ArrayException a=new ArrayException();
		a.getdata();
	}
}

