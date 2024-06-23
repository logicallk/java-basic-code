import java.util.Scanner;
class TableOfUser
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number upto you want print table: ");
		int n=scan.nextInt();
		//table of 5 using 
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<10;j++)
			{
			System.out.println(i*j);
			}
			System.out.println();
		}

	}
}