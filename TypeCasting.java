

//implicit typecasting  byte->short->char->int->long->float->double   it is done by jvm no need to do any thing by programmer
/*explicit typcasting double->float->long->int->char->short->byte     it is not done by jvm .. it is done by progrmmer ..for example double to int so when you typecastit 
that time jvm decide which byte is taken for int because int is less size than double */
class TypeCasting{
	void testTypeCasting()
	{
		long d=25;
		int c=5;
		char b=(char)(c+d);
		
		byte b1=95;
		short s=20;
		double d2=(b1/s)+s;
		
		float f=20.5f;
		double d1=20;
		char c1=(char)(((f/d1)+f)-d1);
		System.out.println("b : "+b);
		System.out.println("d : "+d2);
		System.out.println("c : "+c1);
		
	}
	public static void main(String[] arg)
	{
		int a=4;
		double d=a;
		System.out.println(d);// hear implicit type casting is done by jvm becuase size of double is big than int 
		double p= 12.5; 
		//a=p;// hear implicit type casting is not done by jvm becuase size of double is big than int  so we need to typecaste and it is explicit typecasting
		a=(int)p;
		System.out.println(a);
		TypeCasting tc=new TypeCasting();
		tc.testTypeCasting();
	}    
	
}