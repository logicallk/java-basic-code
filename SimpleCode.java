class SimpleCode{
	public void Hi()
	{
		System.out.println("I am parent class method");
	}
	public static void main(String[] arg)
	{
		System.out.println("HI java");
		SubSimpleCode s=new SubSimpleCode();
		s.Hi();
	
	}

}

class SubSimpleCode extends SimpleCode{
	public void Hi()
	{
		System.out.println("i am child method");
	}
		

}