class Master1
{
	

	void test()
	{
		int k=12;  //local variable
		System.out.println("K VALUE IS:" +k);
	}

}

class LocalVariable
{
	public static void main(String[] args)
	{
		Master1 m1 = new Master1();
		m1.test();
	}
}