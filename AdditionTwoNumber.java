import java.util.Scanner;
class AdditionTwoNumber{
	public static void main(String[] arg)
	
	{
		System.out.println("I am main method");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a value ");
		int a=scan.nextInt();
		
		AdditionTwoNumber add=new AdditionTwoNumber();
		add.main();
		add.main(a);
		
	}
	
	public static void main(){
		System.out.println("i am main method but i need to call and i am without argument");
	}
	
	public static void main(int a){
		System.out.println("i am main method but i need to call and i am with argument integer type "+a);
	}
}