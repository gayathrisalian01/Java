import java.util.*;
class bmi
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weight in KG:");
		float weight=sc.nextFloat();
		System.out.print("Enter height in cm:");
		float heightcm=sc.nextFloat();
		float heightm=heightcm/100;
		double bmical=weight/(heightm*heightm);
		if(bmical>0)
		{
			System.out.println("BMI "+bmical);
			if(bmical<18.5)
			{
				System.out.println("Underweight !");
			}
			else if(bmical>=18.5&&bmical<=24.9)
			{
				System.out.println("Normal");
			}
			else if(bmical>=25&&bmical<=29.9)
			{
				System.out.println("Overweight");
			}
			else if(bmical>=30)
			{
				System.out.println("Obese");
			}
		}
		else
			System.out.print("Incorrect Input");


	}

}