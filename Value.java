class Value
{
	public static void main(String[] args)
	{
		demo d1 = new demo();
		d1.k = 33;
		System.out.println("VALUE OF d1 is:"+d1.k);

		demo d2 = new demo();
		System.out.println("VALUE OF d2 is:"+d2.k);
	}

}


class demo
{
	int k=10;

}