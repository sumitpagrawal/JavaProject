class ArrayExtMethodOpposite
{
	static int[] printArray()
	{
		int[] arr1= new int[2];
		arr1[0]=10;
		arr1[1]=20;	
		return arr1;
	}	


	public static void main(String[] args)
	{
		
		int[] arg = printArray();   //arr1=arg 
		
		
		for(int i=0; i<arg.length; i++)
		{
			System.out.println(arg[i]);
		}	
	}
}