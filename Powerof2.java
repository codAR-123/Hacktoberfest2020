class Powerof2
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		double result = 1.0;
		for(int i=1;i<=n;i++)
		{
			result = result * 2;		
		}
		System.out.println(2+"^"+n+" is : "+String.format("%.0f",result));
	}
}
			