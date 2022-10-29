package colorStack;

public class colorStack 
{
	private int [] newArray;
	private int red;
	private int blue;
	public int originalSize;
	
	// EXAMPLE USED IN COMMENTS. Size entered is 10...so array size is doubled to 20 
	public colorStack(int size)
	{
		originalSize = size; // Keep track of the original size 
		
		newArray = new int[size * 2]; // Double the size of the array, so the array
		// is always larger then blue stack and red stack combined 
		
		blue = (size / 2) - 1; // Half way point of the array. EX: 10 / 2 = 5 - 1 = 4
		red  = -1; // Handles the front of the array 
	}
	
	
	public int redPeek() // Return the size of red 
	{
		return newArray[red]; // has a range of 0 to 4 with our example. 
	}
	
	public int bluePeek() // Return the size of blue
	{
		return newArray[blue];  // has a range of 5 to 9 with our example
	}
	
	public int peekRed() // Return the front of Red 
	{
		return newArray[red];
	}
	
	public int peekBlue() // Return the front of blue
	{
		return newArray[blue];
	}
	
	public boolean redIsEmpty()
	{
		return (red == -1); // If red is -1 it is empty 
	}
	
	public boolean blueIsEmpty()
	{
		return (blue == (originalSize / 2) - 1); //is empty if it equals half way point of array
		// Blue should be 1 more then the half way point 
	}
	
	public boolean redIsFull()
	{
		return (red == (originalSize / 2) - 1); // If red is equal to the half way point, red is full
		// Red stops at the half way point 
	}
	
	public boolean blueIsFull()
	{
		return (blue == (originalSize - 1)); // if blue equals the end, in this case 9
	}
	
	public void pushRed(int data)
	{
		if(redIsFull())
			System.out.println("Red Stack is full \n");

		else
			newArray[++red] = data;
	}
	
	public void displayRed()
	{
		if(!redIsEmpty()) 
		{
		for(int index = 0; index <= red; ++index)
			System.out.print(newArray[index] + " ");
		}
		else
			System.out.println("Red Stack is empty!");

		System.out.println();
	}
	
	public void pushBlue(int data)
	{
		if(blueIsFull())
			System.out.println("Blue Stack is full \n");
		else
			newArray[++blue] = data;
	}
	
	public void displayBlue()
	{
		if(!blueIsEmpty())
		{
		for(int index = ((originalSize / 2 )); index <= blue; ++index)
			System.out.print(newArray[index] + " ");
		}
		else
			System.out.println("Blue Stack is empty!");
		System.out.println();
	}
	
	public int redPop()
	{
		int temp;
		
		if(redIsEmpty())
		{
			System.out.println("Red Stack is empty!");
			return -1;
		}
		else
		{
			temp = newArray[red];
			--red;
			
			return temp;
		}

	}
	
	public int bluePop()
	{
		int temp;
		
		if(blueIsEmpty())
		{
			System.out.println("Blue Stack is empty!");
			return -1;
		}
		else
		{
			temp = newArray[blue];
			--blue;
			
			return temp;
		}
	}
	
}
