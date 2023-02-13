class FibonaciiSeries
{

	public static void main(String[] args)
	{
		int a=0; //initial value of a
		int b=1; //initail value of b

		System.out.print(a+" "+b+" ");
		
		for(int i=0;i<10;i++)
		{
			int c=a+b; //addition of last 2 numbers
			System.out.print(c+" ");

			a=b;
			b=c;
		}
	}
}