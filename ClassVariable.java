class Master1
{
	static int k; // class variable

	void test()
	{
		System.out.println("TEST METHOD");
	}

}

class ClassVariable
{
	public static void main(String[] args)
	{
		Master1 m1 = new Master1();
		System.out.println("K VALUE IS:" +Master1.k);
	}
}