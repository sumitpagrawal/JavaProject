class Central1
{
	static int k =20;
	
	static
	{
	System.out.println("STATIC BLOCK OF BL CLASS");
	}
}

class MainClass1
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD");
		System.out.println("K value is: "+Central1.k);
	}

	static
	{
		System.out.println("STATIC BLOCK OF MAIN CLASS");
	}
}