class MainClass1
{
	static int k =12;
	double d = 33.66;

	static void test()
	{
	System.out.println("TEST METHOD");
	}

	
	void display()
	{
	System.out.println("DISPLAY METHOD");	
	}

	public static void main(String[] args)
	{
	System.out.println("k value is:"+k);
	test();

	MainClass1 m1 = new MainClass1();
	System.out.println("d value is:"+m1.d);
	m1.display();
	}

}