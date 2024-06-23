import java.util.Scanner;
class AsciiFind{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter character which you find ASCII value: ");
		char p=(char) scan.next();
		System.out.println((int)p);
	}
}