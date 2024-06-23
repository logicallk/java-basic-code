import java.util.Scanner;
class DaysInMonth
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Check days in month for 2024 year");
		System.out.println("1.jan\n2.feb\n3.mar\n4.apr\n5.may\n6.june\n7.july\n8.aug\n9.sep\n10.oct\n11.nov\n12.dec\nEnter your month number: ");
		int number=scan.nextInt();
		switch(number)
		{
			case 1:System.out.println("Days: 31");
				break;
			case 2:System.out.println("Days: 29");
				break;
			case 3:System.out.println("Days: 31");
				break;
			case 4:System.out.println("Days: 30");
				break;
			case 5:System.out.println("Days: 31");
				break;
			case 6:System.out.println("Days: 30");
				break;
			case 7:System.out.println("Days: 31");
				break;
			case 8:System.out.println("Days: 30");
				break;
			case 9:System.out.println("Days: 31");
				break;
			case 10:System.out.println("Days: 31");
				break;
			case 11:System.out.println("Days: 30");
				break;
			case 12:System.out.println("Days: 31");
				break;
				
			default:System.out.println("Enter valid month number....!");
		}
	}
}