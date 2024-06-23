import java.util.Scanner;

class ScannerDemo{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to RCPIT...!");
		System.out.println("Please enter your name");
		String name=scan.nextLine(); // nextLIne use for take sentence input and next use for only read input or take only one word or upto space come
		System.out.println("Welcom "+name);
	}
}