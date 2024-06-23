class OneDigitSift
{
	public static void main(String[] arg)
	{
		int n=512;
		int sum=0;
		int p=0;
		while(n!=0)
		{
			p=n%10;
			
			
			sum=(sum)+(p*10)/10;
			n/=10;
			if(n<10)
			{
				sum=(sum)+(p*10);
			}
		}
		//sum=(sum*10)+(p);
		System.out.println(sum);
	}
}