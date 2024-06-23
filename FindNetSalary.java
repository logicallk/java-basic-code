import java.util.Scanner;
class FindNetSalary
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		double amount=scan.nextInt();
		double basic=(amount)*0.4;
		double HRA=amount*0.1;
		double TADA=amount*0.15;
		double Medical=amount*0.1;
		double PR=amount*0.1;
		double MA=amount*0.15;
		System.out.println(basic+HRA+TADA+Medical+PR+MA);
	}
}