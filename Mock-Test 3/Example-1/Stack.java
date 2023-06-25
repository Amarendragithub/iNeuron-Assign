public class Stack {
    private int maxSize; 
    private int top; 
    private int[] stackArray; 

   
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }

 
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; 
        }
        return stackArray[top--];
    }

   
    public boolean isEmpty() {
        return (top == -1);
    }
}
