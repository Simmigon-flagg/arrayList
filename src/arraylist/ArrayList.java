/* Simmigon Flagg 12:00pm - 1:15pm




 */
package arraylist;

public class ArrayList {

    private Object[] myArray;

    //This part seems done
    public ArrayList() {
        myArray = new Object[10];
    }
//This part seems done

    public ArrayList(int n) {
        myArray = new ArrayList[n];
    }

    public void add(Object x) {
        /*If the array is Empty place the object at index 0     
         */
        if (isEmpty()) {
            myArray[0] = x;

        } /*else If the last value in the list is an object "Full" is printed to the Screen
         * 
         */ else if (myArray[myArray.length - 1] != null) {
            System.out.println("Obect: \"" + x + "\" was not added.");

        } /*else start from end of the list and move backwards until you reach the first object from the end         
         */ else {
            for (int i = myArray.length - 1; i >= 0; i--) {
                /*if the value is not null the if statement executes it's body onther wise if null is true
                the body of the if statement is skipped*/
                if (myArray[i] != null) {
                    /*The updated variblae is moved forwards before the object is placed
                     * Then inputs the incoming object behind the last object in the list.
                     */
                    myArray[++i] = x;
                    break;
                }
            }
        }
    }

    public void add(int index, Object x) {
        if (myArray[index] == null) {
            myArray[index] = x;
        } else {
            System.out.println("Slot is occupied.\nThe object: \"" + x + "\" was not place into slot \"" + index + "\".");
        }
    }

    public Object get(int index) {
        return myArray[index];
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                count++;
            }
        }


        return count;
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                empty = false;
                break;
            }
        }
        return empty;
    }

    public boolean isIn(Object ob) {
        boolean found = false;
        try {
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(found);
                if (myArray[i].equals(ob)) {
                    System.out.println("Object: \"" + ob + "\" is in the list.");
                    found = true;
                    break;
                }
            }
        } catch (java.lang.NullPointerException e) {
            System.out.println("Object: \"" + ob + "\" is not in the list.");
        }
        return found;
    }

    public int find(Object n) {
        int i = 0;
        try {
            for (i = 0; i < myArray.length; i++) {

                if (myArray[i].equals(n)) {

                    break;
                }
            }
            System.out.println("Object: \"" + n + "\" is at index \"" + i + "\".");
        } catch (java.lang.NullPointerException e) {

            //This will return negative 1 which means not in the list

            i -= i + 1;
            System.out.println("Object: \"" + n + "\" is not in the list \"" + i + "\" is returned.");
        }
        return i;
    }

    public void remove(Object n) {
        int index = find(n);
        myArray[index] = null;
    }

    public int Capacity() {
        return myArray.length;
    }
}
