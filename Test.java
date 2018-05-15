class Test
{
	public static void main(String[] args)
	{
		int k=1; // instance variable
		
		for(int i=1; i<=5; i++)
		{
			int j=1;  //Local variable 
			j++;
			k++;
			System.out.println("J Value is:"+j);
			
		}
		System.out.println("k Value is:"+k);
	}

}
