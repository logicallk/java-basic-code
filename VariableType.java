//variable type
//static ,local ,globel,instance

class VariableType{
	int ab=11;
	static int _a=0;
	void localVariable()
	{
		int b=10;
		System.out.println("value of local variable b "+b);
		System.out.println("value of global variable ab but access in method "+ab);
	}
	public static void main(String[] arg)
	{
		int c=0;
		System.out.println(_a);
		VariableType v=new VariableType();
		v.localVariable();
		System.out.println("value of intance variable "+c);
		
		
	}
} 