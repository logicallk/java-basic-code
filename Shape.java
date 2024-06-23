import java.util.Scanner;
class Shape{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice as below: \n1.Circle\n2.Square\n3.Rectangle\n");
		
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Enter Radius: ");
					int radius=scan.nextInt();
					System.out.println("Area of circle: "+(3.14*radius*radius));
					System.out.println("Paremeter of circle: "+(2*3.14*radius));
					break;
			
			case 2: System.out.println("Enter length: ");
					int length=scan.nextInt();
					System.out.println("Area of Square: "+(length*length));
					System.out.println("Paremeter of Square: "+(4*length));
					break;
					
			case 3: System.out.println("Enter length: ");
					length=scan.nextInt();
					System.out.println("Enter width: ");
					int width=scan.nextInt();
					System.out.println("Area of Rectangle: "+(length*width));
					System.out.println("Paremeter of Rectangle: "+((length+width)*2));
					break;
			
			default : System.err.println("Please Enter right choice...!");
					
		}
	}
}