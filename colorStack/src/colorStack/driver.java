package colorStack;

public class driver {

	public static void main(String[] args) 
	{
		colorStack doubleStack = new colorStack(10);
		
		doubleStack.pushBlue(11);
		doubleStack.pushBlue(67);
		doubleStack.pushBlue(8);
		doubleStack.pushBlue(3);
		doubleStack.pushBlue(14);
		doubleStack.pushBlue(71);
		
		doubleStack.pushRed(6);
		doubleStack.pushRed(81);
		doubleStack.pushRed(61);
		doubleStack.pushRed(98);
		doubleStack.pushRed(105);
		doubleStack.pushRed(777);

		doubleStack.redPop();
		doubleStack.redPop();
		doubleStack.bluePop();
		doubleStack.bluePop();

		

		System.out.print("Blue Stack: ");
		doubleStack.displayBlue();
		
		
		System.out.println();

		System.out.print("Red Stack: ");
		doubleStack.displayRed();
		
		System.out.println();
		System.out.println("Blue Peek: "  + doubleStack.bluePeek());
	
		System.out.println("Red Peek: " + doubleStack.redPeek());
	}

}
