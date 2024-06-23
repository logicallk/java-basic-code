import java.util.Scanner;
class Quantity{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many dozen food you buy: ");
		double amount=scan.nextDouble();
		int p=(int)amount;
		int quantity=p*12;
		quantity=(amount-p)+quantity;
		System.out.println(quantity);
	}
}