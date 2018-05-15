class Pattern
{
	public static void main(String[] args)
	{
		int lines=3;
		int star=1;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print("*");  //using only  on same line
			}
			System.out.println(); //To bring the cursor to next line  "println"
			star++;
		}
	}
}