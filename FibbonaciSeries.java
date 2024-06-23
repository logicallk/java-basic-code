class FibbonaciSeries
{
	public static void main(String[] arg){
	int first_no=0;
	int second_no=1;
	int[] F_series=new int[25];
	F_series[0]=0;
	F_series[1]=1;
	System.out.println(F_series[0]);
	System.out.println(F_series[1]);
	for(int i=2;i<25;i++)
	{
		F_series[i]=F_series[i-1]+F_series[i-2];
		System.out.println(F_series[i]);
	}
	
	}
}