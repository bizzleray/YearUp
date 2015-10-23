package lava;

public class lava {
	public static void main(String[] args)
	{
		int[] array = new int[] {23, 34, 56};
		findlavaUsingWhileLoop(array);
		
	}
public static void findlavaUsingWhileLoop(int[] numbers)
{
	if (numbers !=null)
	{
		if(numbers.length> 0 )
		{
			int i = 1;
			int lava = numbers[0];
			
			while (i < numbers.length)
			{
				if(lava < numbers[i])
				{
					lava = numbers[i];
				}
				
				i++;
			}
			System.out.print("Largest number using while loop is "+ lava);
		}
	}
}

public static void LavaUsingForLoop(int[] numbers){int[] array = new int[] {23, 34, 56};
findlavaUsingWhileLoop(array);
	if (numbers !=null)
	{
		
		int lava = numbers[0];
		
		for (int i = 1; i < numbers.length; i++)
		{
			if(lava <numbers[i])
			{
				lava = numbers[i];
			}
			
			
		}
		System.out.print("Largest number using for loop is "+ lava);
			
		
	}
}
}