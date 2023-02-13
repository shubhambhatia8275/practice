//to find largest element index in array


class LargestElement
{

	public static void main(String[] args)
	{
		int arr[]={778,20,65,75,777};

		int max=0;

		for(int i=1;i<arr.length;i++)
		{
			if(arr[max] < arr[i])
			{
			max=i;
			}
		}
		
		System.out.println("Max element:- "+max);
	}
}