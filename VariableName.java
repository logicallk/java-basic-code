//variable naming 

class VariableName{
	public static void main(String[] arg)
	{
		//name should kbe start with letter or _ symbol only
		int B=10;
		int b=15;
		int B1=1;
		//int 1B=12;  Wrong naming never start with number
		//int #B=2;   # is not allow 
		//int B@c=11; not allow
		//int c#=200; not allow
		int A_b=111;
		//int A-b=1111;  not allow
		
		System.out.println(B);
		System.out.println(b);
		System.out.println(B1);
		//System.out.println(1B);
		//System.out.println(#B);
		//System.out.println(B@c);
		//System.out.println(c#);
		System.out.println(A_b);
		//System.out.println(A-b);
	}
}