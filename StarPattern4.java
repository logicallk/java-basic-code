class StarPattern4
{
	public static void main(String[] arg)
	{
		int[] f={0,1,1,2,3,5,8,13};
		for(int i=0;i<5;i++)
		{
			int k=i;
			for(int j=0;j<=i;j++)
			{
				if(i==0)
				{
				System.out.print(f[j]+" ");
				}
				else if(i==1)
				{
					System.out.print(f[j]+" ");
				}
				else if(i==2)
				{
					System.out.print(f[j]+" ");
				}
				else{
					
					System.out.print(f[k-1]+f[k-2]+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}