import java.util.Random;
import java.util.Scanner;
class OTPGenerate
{
	 String generateOtp()
	{
		String n="0123456789";
		Random r=new Random();
		char[] OTP=new char[6];
		for(int i=0;i<6;i++)
		{
		   OTP[i]=n.charAt(r.nextInt(10));
		}
		return new String (OTP);
	}
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		OTPGenerate og=new OTPGenerate();
		String G_otp=og.generateOtp();
		System.out.println(G_otp);
		System.out.println("Enter OTP ");
		String I_otp=scan.next();
		if(G_otp.equals(I_otp))
		{
			System.out.println("User is Validate");
		}
		else
		{
			System.out.println("User is not Validate");
		}
	}
}