import java.util.Iterator;

public class MyArray {
    private Integer[] values;
    private int currentIndex = 0;

    public MyArray() {
        values = new Integer[5]; // [0,1,2,3,4]
    }

    public void add(Integer value) {
        increaseArray(); // increase
        values[currentIndex++] = value;
    }



    public void add(int index, Integer value) {
        //[1,2,3]   1-> 4
        if (index < 0 || index >= currentIndex){
            System.err.println("ERROR");
            return;
        }
        increaseArray();
        shiftToRight(index);
        values[index] = value;
    }



    public void addFist(Integer value) {
    }

    public void addLast(Integer value) {
    }

    /**
     * Fetching  value
     */

    public Integer get(int index) {
        return values[index];
    }

    public int indexOf(Integer value) {
        return 0;
    }

    /**
     * Update value
     */

    public Integer set(int index, Integer value) {
        // return old value
        return 0;
    }

    /**
     * Remove/delete
     */

    public Integer remove(int index) {
        // returns deleted value
        return null;
    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    public int remove(Integer value) {
        // returns deleted index
        return 0;
    }

    public void clear() {
    }

    /**
     * Is methods
     */

    public boolean isEmpty() {
        return false;
    }

    public boolean isContains(Integer value) {
        return false;
    }

    /**
     * Other methods
     */

    public int size() {
        return 0;
    }

    public Object[] toArray() {
        return null;
    }

    public void printAll() {

    }

    public void printFirstAndLast() {

    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < currentIndex; i++) {
            str = str + values[i];
            if (i != currentIndex - 1) {
                str = str + ", ";
            }
        }
        str = str + "]";
        return str;
    }


    /**
     * Iterating
     */
    public Iterator<Integer> iterator() {
        return null;
    }



    private void increaseArray(){
        if (currentIndex == values.length) {
            Integer[] newArray = new Integer[currentIndex * 2];
            for (int i = 0; i < currentIndex; i++) {
                newArray[i] = values[i];
            }
            values = newArray;
        }
    }


    private void shiftToRight(int index) {
        for (int i = currentIndex; i != index; i--){
            values[i] = values[i - 1];
        }
        values[index] = null;
        currentIndex++;
    }

}
