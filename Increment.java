class Increment
{
	public static void main(String[] args)
		{
			int a = 2;
			int b = 3;

			b=a++ + ++a +  --a  +  a++  + a--  + a;
			System.out.println(+a);
			System.out.println(+b);
		
		}	

}
