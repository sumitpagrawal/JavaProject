	class Reinitialization2
	{
		public static void main(String[] args)
		{
			int a=10;
			int b=20;
			int c=30;
			
			
			System.out.println("A VALUE IS:" +a);
			System.out.println("B VALUE IS:" +b);
			System.out.println("C VALUE IS:" +c);
			
			a=c; //a  30 
			b=a; //b 30 
			c=a; // c 10    
			b=c; // c 30 
			c=a; // a 30 
			
			System.out.println("*****************************8");
			System.out.println("A VALUE IS:" +a);
			System.out.println("B VALUE IS:" +b);
			System.out.println("C VALUE IS:" +c);
		
		}
	}