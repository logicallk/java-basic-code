import java.util.Scanner;
class GradeCalculate
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		int[] marks=new int[5];
		int sum=0;
		char[] grade=new char[5];
		System.out.println("Enter the 5 subject marks equal or less 100: ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the "+i+" subject mark equal or less 100: ");
			marks[i]=scan.nextInt();
			if(marks[i]<=100)
			{
			 sum+=marks[i];
			}
			else{
				System.out.println("Please enter valid marks ");
			}
		}
		double percentage=sum/5;
		for(int i=1;i<6;i++)
		{

				if(marks[i]>=85)
				{
					grade[i]='A';
				}
				else if(marks[i]>=60 && marks[i]<85)
				{
					grade[i]='B';
				}
				else if(marks[i]>=35 && marks[i]<60)
				{
					grade[i]='C';
				}
				else{
					grade[i]='F';
				}	
		}
		System.out.println("Percentage "+percentage);
		for(int i=1;i<6;i++)
		{
			System.out.println("Subject "+i+" marks "+marks[i]+" Grade "+grade[i]);
		}
		
	}
}