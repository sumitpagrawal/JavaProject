class Address
{
	public static void main(String[] args)
	{
		demo d1 = new demo();
		d1.info();

		demo d2 = new demo();
		d2.info();		
		
		System.out.println("d1 value is:"+d1);
		System.out.println("d2 value is:"+d2);
	}
}


class demo
	{
		void info()
		{
			System.out.println("Info method address program");
		}
	}
	