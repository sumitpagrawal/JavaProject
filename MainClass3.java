class Central1
{
	int k=44;

	{
		k=33;
		System.out.println("Non-Static Block");
	}

	static
	{
	int k=22;
	System.out.println("STATIC BLOCK");
	}
}

class MainClass3
{
	public static void main(String[] args)
	{
		Central1 c1 = new Central1();
		Central1 c2 = new Central1();
		System.out.println("K VALUE IS: "+c1.k);
	}
}