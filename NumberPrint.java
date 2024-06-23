import java.util.Scanner;
class NumberPrint{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int result=0;
		while(num!=0)
		{
			int p=num%10;
			result=p;
			num=num/10;
			
		}
		System.out.println(result);
	}
}