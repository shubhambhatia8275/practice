//To check whether string is Palindrome or not:-

class CheckPalindrome
{
	
	static boolean isPal(String str)
	{
		int begin=0;
		int end=str.length()-1;
		
		while(begin<end)
		{
		if(str.charAt(begin) != str.charAt(end))
		return false;

		begin++;
		end--;
		}
		return true;
	}

	

	public static void main(String []args)
	{

		String str="AABAAA";
	
		System.out.println(isPal(str));
	}
}