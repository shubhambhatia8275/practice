class PalindromeCheck
{

	public static void main(String args[])
	{
		int num=102;
		int reverse=0;
		int temp=num;

		while(num>0)
		{
			int remainder=num%10;
			reverse=(reverse*10)+remainder;
			num=num/10;
		}

		if(temp==reverse)
		System.out.println("Palindrone");
		else
		System.out.println("Not Palindrone");
	}
}