// assume we've changed EmptyStackException
// to an unchecked exception

public class Stack {
    
    // the actual stack
    private List<Integer> stack;
    
    /*
     * Creates a new stack.
     *
     */
    public Stack() {
        // some code
    }
    
    /*
     * Pushes an item onto this stack.
     *
     * @param item the item to push
     * @return this stack
     */
    public Stack push(int item) {
        stack.add(item);
        return this;
    }

    /*
     * Pops an item from the stack.  Requires the stack to be non-empty.
     *
     * @return the item popped off the stack
     */
    public int pop() {
        try {
            return stack.remove(0);            
        } catch (IndexOutOfBoundsException e) {
            // we translate the exception
            throw new EmptyStackException(e);
        }
    }
    
    /*
     * Returns true if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (stack.size() > 0);
    }

}

///////////////////////// Example Usage

void someFunction(Stack st) {
    int i;
    while (!st.isEmpty()) {
        i = st.pop();
        System.out.println(i);
    } 
    System.out.println("all done!");
    
}

