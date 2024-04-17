import java.io.*;
class square implements Runnable 
{
    int n;
    square(int n)
    {
        this.n=n;
    }
    public void run()
    {
        int i,s;
        for(i=1;i<=n;i++)
        {
            s=i*i;
            System.out.println("Square of "+i+" is "+s);
        }
        System.out.println("End of Thread sqaure");
    }
}
class cube implements Runnable 
{
    int n;
    cube(int n)
    {
        this.n=n;
    }
    public void run()
    {
        int i,c;
        for(i=1;i<=n;i++)
        {
            c=i*i*i;
            System.out.println("Cube of "+i+" is "+c);
        }
        System.out.println("End of Thread Cube");
    }
}
class intThread
{
    public static void main (String[] args)
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=0;
        try 
        {
            System.out.println("Enter how many number?");
            m=Integer.parseInt(br.readLine());
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }  
        square sq=new square(m);
        cube cu=new cube(m);
        Thread t1=new Thread(sq);
        Thread t2=new Thread(cu);
        t1.start();
        t2.start();
    }
}