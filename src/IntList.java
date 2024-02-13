/**
 * The IntList interface defines a set of operations
 * for an ordered (indexed) collection of ints, which
 * in mathematics is known as a sequence.
 */
public interface IntList extends Iterable<Integer> {

    /**
     * Prepends (inserts) the specified value at the front of the list (at index 0).
     * Shifts the value currently at the front of the list (if any) and any
     * subsequent values to the right.
     * @param value value to be inserted
     */
    void addFront(int value);

    /**
     * Appends (inserts) the specified value at the back of the list (at index size()-1).
     * @param value value to be inserted
     */
    void addBack(int value);

    /**
     * Inserts the specified value at the specified position in this list.
     * Shifts the value currently at that position (if any) and any subsequent
     * values to the right.
     * @param index index at which the specified value is to be inserted
     * @param value value to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    void add(int index, int value);

    /**
     * Removes the value located at the front of the list
     * (at index 0), if it is present.
     * Shifts any subsequent values to the left.
     */
    void removeFront();

    /**
     * Removes the value located at the back of the list
     * (at index size()-1), if it is present.
     */
    void removeBack();

    /**
     * Removes the value at the specified position in this list.
     * Shifts any subsequent values to the left. Returns the value
     * that was removed from the list.
     * @param index the index of the value to be removed
     * @return the value previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    int remove(int index);

    /**
     * Returns the value at the specified position in the list.
     * @param index index of the value to return
     * @return the value at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    int get(int index);

    /**
     * Returns true if this list contains the specified value.
     * @param value value whose presence in this list is to be searched for
     * @return true if this list contains the specified value
     */
    boolean contains(int value);

    /**
     * Returns the index of the first occurrence of the specified value
     * in this list, or -1 if this list does not contain the value.
     * @param value value to search for
     * @return the index of the first occurrence of the specified value in this list
     * or -1 if this list does not contain the value
     */
    int indexOf(int value);

    /**
     * Returns true if this list contains no values.
     * @return true if this list contains no values
     */
    boolean isEmpty();

    /**
     * Returns the number of values in this list.
     * @return the number of values in this list
     */
    int size();

    /**
     * Removes all the values from this list.
     * The list will be empty after this call returns.
     */
    void clear();
}
