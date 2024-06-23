import java.util.Scanner;

class StudentDetail{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(".........Welcome to RCPIT ........! \n");
		System.out.println("Fill below ask information for Resistretion");
		System.out.println("Please enter first name");
		String firstname=scan.next();
		System.out.println("Please enter last name");
		String lastname=scan.next();
		System.out.println("Please enter education");
		String education=scan.next();
		System.out.println("Please enter percentage");
		Double percentage=scan.nextDouble();
		System.out.println("Please enter address");
		String address=scan.next();
		System.out.println("Please enter contact number");
		String contact=scan.next();
		System.out.println("Please enter email");
		String email=scan.next();
		System.out.println("Please enter password");
		String password=scan.next();
		 System.out.println("Resistretion Succefully");
		 
		 System.out.println("For login please enter your email and password");
		 System.out.println("Please enter email");
		 String Inputemail=scan.next();
		 System.out.println("Please enter password");
		 String Inputpassword=scan.next();
		 
		 if(Inputemail.equals(email) && Inputpassword.equals(password))
		 {
			 System.out.println("Welcome "+firstname+" "+lastname);
		 }
		 else
		 {
			 System.err.println("please check user email and password enter you and try again...!");
		 }
		
		
		
	}

}