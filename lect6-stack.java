// assume EmptyStackException is defined somewhere as
// a checked exception


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
     * Pops an item from the stack.  If the stack is empty, 
     * throws an EmptyStackException.
     *
     * @return the item popped off the stack
     * @throws EmptyStackException if the stack is empty.
     */
    public int pop() throws EmptyStackException {
        try {
            return stack.remove(0);            
        } catch (IndexOutOfBoundsException e) {
            // we translate the exception
            throw new EmptyStackException(e);
        }
    }
    
}

///////////////////////// Example Usage

void someFunction(Stack st) {
        int i;
        try {
            while (true) {
                i = st.pop();
                System.out.println(i);
            }
        } catch (EmptyStackException e) {
            System.out.println("all done!");
        }
        
}



