class MethodObj
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		System.out.println("VALUE OF d is: "+d1.d);
		d1.disp();
	}

}


class Demo
{
	int d=33;

	void disp()
	{
	System.out.println("Non Static member disp method");
	}
}

