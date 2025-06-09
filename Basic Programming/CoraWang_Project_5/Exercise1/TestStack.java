public class TestStack {

	public static void main(String[] args) {
		Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.printStack(); 
        System.out.println("Peek: " + myStack.peek()); 
        System.out.println("Pop: " + myStack.pop()); 
        myStack.printStack(); 

	}

}
