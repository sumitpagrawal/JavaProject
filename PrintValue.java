class PrintValue
{
	static int k=20;
	static
	{
		k=66;	
	}

	static
	{
		int k=55;
	}

}

class MainClass2
{
		public static void main(String[] args)
	{
		System.out.println("K VALUE IS:"+PrintValue.k);
	}

}