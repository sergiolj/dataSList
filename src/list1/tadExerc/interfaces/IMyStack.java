package list1.tadExerc.interfaces;

public interface IMyStack <T> {
    /**
     * push() Pushes an item onto the top of the stack
     * @param obj Is the object give to the method to add at the top of
     *            the stack, or over the last element added.
     * Stack in java are implemented over a vector of objects.
     * @return the object data
     */
    T push(T obj);

    /**
     * pop() Remove the last object from the stack.
     * @return the last object add.
     */
    T pop();

    /**
     * peek() Retrieve the last object from the stack without remove it.
     * @return the last object add.
     */
    T peek();

    /**
     * isEmpty() Tests if the stack is empty
     * @return True if the stack is empty and False otherwise
     */
    boolean isEmpty();

    /**
     * search() Verify if the given object are in any place the stack
     * @param obj Is the object give to the method to search in
     *      *            the stack.
     * @return an integer that represents the position of the object.
     */
    int search(T obj);

    String toString();
}
