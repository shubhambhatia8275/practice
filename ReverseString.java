// Program to reverse whole string

class ReverseString
{

	public static void main(String []args)
	{
		
		String str="Hello Shubham";
		String newStr="";

	for(int i=str.length()-1;i>=0;i--)
	{
		newStr=newStr+str.charAt(i);
	}

	System.out.println("New String:- "+newStr);
	}
}