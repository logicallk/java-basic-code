import java.util.Scanner;
class FindDivisible{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number for check it is divisible by 3 and 5 or not: ");
		int number=scan.nextInt();
		if((number%3==0)&&(number%5==0))
		{
		  System.out.println(number+" is divisible by both 3 and 5");
		}
		else if(number%3==0)
		{
			System.out.println(number+" is divisible by 3 ");
		}
		
		else if(number%5==0)
		{
			System.out.println(number+" is divisible by 5 ");
		}
		else{
			System.out.println(number+" is not divisible by 3 & 5");
		}
		
	}
}