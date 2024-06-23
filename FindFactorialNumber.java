class FindFactorialNumber
{
	public static void main(String[] arg)
	{
	int n=120;
	int mult=1;
	for(int i=1;i<n;i++)
	{
		mult=mult*i;
					System.out.println(mult);
		if(mult==n)
		{
			System.out.println(i);
			return;
		}
	
	}
	}
}