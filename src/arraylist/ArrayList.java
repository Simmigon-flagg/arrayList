/* Simmigon Flagg 12:00pm - 1:15pm

A method that see if a particular object exist in the arraylist --- public boolean isIn(Object ob);
A method that will return the location of first occurrence of an Object starting from location 0 ----- public int find (Object n);
A method that will remove the first occurrence of an Object starting from location 0 ----- public void remove (Object n);
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
            
        } 
        /*else If the last value in the list is an object "Full" is printed to the Screen
             * 
             */
        else if (myArray[myArray.length - 1] != null) {
            System.out.println("Obect: \""+x+"\" was not added.");

        } 
        /*else start from end of the list and move backwards until you reach the first object from the end         
         */
        else {
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
            System.out.println("Slot is occupied.\nThe object: \""+x+"\" was not place into slot \""+index+"\".");
        }  
    }

    public Object get(int index) {
        return myArray[index];
    }

    public int size() {
        int count =0 ;
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
        return true;
    }

    public int find(Object n) {
        return 1;
    }

    public void remove(Object n) {
    }
}
