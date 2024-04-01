class fee
{
	public static void main(String args[])
	{
		double tfee=50000;
		double nfee=0 ;
		int year;
		nfee=tfee*0.05;
		for(year=1;year<=10;year++)
		{
			tfee=tfee+nfee;
			System.out.println("The fee after "+year+" year = "+tfee);
		}
	}
}
