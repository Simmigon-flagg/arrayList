/* Simmigon Flagg 12:00pm - 1:15pm

One default constructor that will create an arraylist object with a default size of 10 ------ public arraylist();
Another constructor that accepts a parameter of type int and sets the size to this parameter ---- public arraylist(int n);
A method that allows you to place a value at the end of the arraylist ---- public void add(Object x);
A method that allows you to place a value at a given location ---- public void add(int index, Object x);
A method that allows you to retrieve a value from a given location ---- public Object get(int index);
A method that allows you the number of elements in the the arraylist ---- public int size();
A method would test to see if the arraylist is empty ---- public boolean isEmpty();
A method that see if a particular object exist in the arraylist --- public boolean isIn(Object ob);
A method that will return the location of first occurrence of an Object starting from location 0 ----- public int find (Object n);
A method that will remove the first occurrence of an Object starting from location 0 ----- public void remove (Object n);
 */
package arraylist;

public class ArrayList {

    private Object[] myArray;

    public ArrayList() {
        myArray = new Object[10];
    }

    public ArrayList(int n) {
        myArray = new ArrayList[n];
    }

    public void add(Object x) {
        myArray[0] = x;

    }

    public void add(int index, Object x) {
        myArray[index] = x;
    }

    public Object get(int index) {
        return myArray[index];

    }

    public int size() {
        return myArray.length;
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < myArray.length; i++) {
             if (myArray[i] != null) {
                empty = false;
            }
        }
        return empty;
    }

    public boolean isIn(Object ob) {
        return true;
    }

    public int find(Object n) {
        return 1;
    }

    public void remove(Object n) {
    }
}