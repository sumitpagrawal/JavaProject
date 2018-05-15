class Master1
{
	int k;

	void test()
	{
		System.out.println("TEST METHOD");
	}

}

class InstanceVariable
{
	public static void main(String[] args)
	{
		Master1 m1 = new Master1();
		System.out.println("K VALUE IS:" +m1.k);
		m1.test();
	}
}