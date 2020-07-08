/**
* CSCI 240 - Stack ADT
* 
* By: Dr. Rybarczyk & Class
*/

// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
// 
// jeremorg
public class Stack<E>
{
	// Points to the top of the Stack.
	private int top; 
	
	// The size of our stack.
	private int size;

	// Array to emulate the Stack. 
	private E [] stack ;
	
	// Default Constructor
	public Stack()
	{ 
		// Default size = 10
		size = 10; 
		
		// Initialize new generic array.
		stack = (E[]) new Object[size];

		// Initialize the value of the top position. 
		top = -1; 
	}
	
	// Non-Default Constructor - One Parameter
	public Stack(int stackSize)
	{ 
		// Ensure that the stackSize entered is greater than 0.
		if(stackSize > 0)
		{
			size = stackSize; 
		}
		else
		{
			System.out.println("Invalid Stack size!");
			System.out.println("Using default size of 10");
			
			size = 10;
		} 

		stack = (E[]) new Object[size]; 
		top = -1; 
	}
	
	// Push Operation
	public void push(E dataElement)
	{ 
		// Check to see if the Stack is full – if not push the element.
		if(isFull())
		{ 
			// We should really throw an exception here...
			System.out.println("Your Stack is full!");
		} 
		else
		{ 
			// Increment the top of the Stack.
			top = top + 1;

			// "Push" the data element onto the Stack.
			stack[top] = dataElement; 
		}
	 }

	 // Pop Operation
	public E pop()
	{ 
		// Check to see if the Stack is empty.
		if(!isEmpty()) 
		{

			// Return the popped data element. 
			return stack[top--];
		}
		else 
		{
			// We should really throw an exception here...
			System.out.println("Stack is empty – cannot pop!"); 
		}
		return null;
	}

	// Is Empty Method
	public boolean isEmpty()
	{ 
		return top == -1; 
	}

	// Is Full Method
	public boolean isFull()
	{
		return top == size;
	}

	// Get's the top element from the Stack.
	public E getTop() 
	{
		return stack[top];
	}

	// Prints the contents of the Stack.
	public void displayStack()
	{ 
		// Loop through our Stack array printing the values.
		for(int i=0;i<=top;i++)
		{ 
			if(i==top)
			{
				System.out.print(stack[i]);
				break;
			}
			System.out.print(stack[i]+ " , "); 
		} 
	}
}
