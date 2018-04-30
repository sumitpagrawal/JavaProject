class ArrayExtMethod
{ 
	public static void main(String[] args)
	{
		int[] arr1 = new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		printArray(arr1);
	
	}

	static void printArray(int[] arg)   //int[] arg = arr1  
	{
		for(int i=0; i<arg.length;i++)
			{
			System.out.println(arg[i]);
			}
	}

}