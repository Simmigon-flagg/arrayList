/* Simmigon Flagg 12:00pm - 1:15pm

 */
package arraylist;

public class ArrayList {
    //Declare array of objects object.

    private Object[] myArray;

    //Precondition: None    
    public ArrayList() {
        myArray = new Object[10];
    }// End of constructor 
    //Postcondition: An Array of size Ten

    //Precondition: An int variable is needed for the parameters.
    public ArrayList(int n) {
        myArray = new Object[n];
    }//// End of constructor
    //Postcondition:The Array Capacity will be the value of the variable n

    //Precondition: An Object x variable is needed for the parameters.
   /*If the array is Empty place the object at index 0 
     * else If the last value in the list is an object "Full" is printed to the Screen
     * else start from end of the list and move backwards until you reach the first object from the end 
     * if the value is not null the if statement executes it's body otherwise if null is true 
     *the body of the if statement is skipped
     * The updated variable i is increment before assigning the Object to the list 
     * then break out of the current loop
     */
    public void add(Object x) {
        String f = "";
        if (isEmpty()) {
            myArray[0] = x;
            f = "Object: \"" + x + "\" was added.";
        } //end of if  
        else if (myArray[myArray.length - 1] != null) {
            f = "Object: \"" + x + "\" was not added.";

        }//end of else if 
        else {
            for (int i = myArray.length - 1; i >= 0; i--) {
                if (myArray[i] != null) {
                    f = "Object: \"" + x + "\" was added.";
                    myArray[++i] = x;
                    break;
                }//End of if
            }//end of for loop
        }//end of else
        System.out.println(f);
    }//End of add() method
    //Postcondition: An Array of size Ten 

    //Precondition: An int variable and an Object variable is needed for the parameters.
    /*The int variable will insert the Object in the location specified by the index
     * If the value at the index is null then we replace that value with the incoming Object x
     * else we send a message Saying that Slot is occupied. If the user tries to place a object in a index that
     * is out of  bound a try catch block is used to print a message. Slot does not exist
     */
    public void add(int index, Object x) {
        String f = "";

        try {
            if (myArray[index] == null) {
                f = "Object: \"" + x + "\" was added.";
                myArray[index] = x;
            }//End of if
            else {
                f = "Slot is occupied.\nObject: \"" + x + "\" was not place into slot \"" + index + "\".";
            }//End of else

        } catch (ArrayIndexOutOfBoundsException e) {
            f = "Slot \"" + index + "\" does not exist.\nObject: \"" + x + "\" was not place into a list.";
        }
        System.out.println(f);
    }// End of add()
    //Postcondition: An object is now added to the  array at a specifed location

    //Precondition: An int variable is needed for the parameters.
    //The value specified will return an Object at the location in the array
    public Object get(int index) {
        return myArray[index];
    }//End of get method
    //Postcondition: We receive the contents of the array at that index

    //Precondition: no data types needed for the parameters.
    /* Size take no argument  a count is initialized to zero
     * A for loop starts from 0 and iterates thought all the elements in the list
     * if the current value at the iteration of the loops is not null, count will be increment by 1
     *  Set a Local varible count to zero
     *  Start a for loop to iteration thought at the indexes of the array
     *  Check for Object if an object is found increment count by 1
     */
    public int size() {
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                count++;
            }//End of if
        }//End of for loop
        return count;
    }//End of size method
    //Postcondition: return count which is the number of object in the list.

    //Precondition: None
    /* initialized a boolean expression to true
     * Start a for loop to iteration thought at the indexes of the array
     * If the value at that current location in the loop is not null 
     * set empty to false and break the loop to stop searching.
     */
    public boolean isEmpty() {

        boolean empty = true;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                empty = false;
                break;
            }//End of if
        }//End of for

        return empty;
    }// End of isEmpty method
    //Postcondition: return the value for empty

    //Precondition: An Object variable is needed for the parameters.
    /*initialized a boolean expression to false A try catch block is needed.
     * If there is a null value in the list, the complier will throw a null pointer 
     * exception  when we try to use the .equals method on the elements of the list where the value is null
     * Start a for loop to iteration thought at the indexes of the array
     * If the incoming object from the parameter equal the content in the index printmessage Obect is in the list.
     * set found to true and break the loop. We only need the first occurrence
     * This will print the Object: is not in the list. when a null value is incurred
     */
    public boolean isIn(Object ob) {
        boolean found = false;
        String f = "";
        try {
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i].equals(ob)) {
                    found = true;
                    f = "Object: \"" + ob + "\" is in the list.";

                    break;
                }//End of if
                else {
                    f = "Object: \"" + ob + "\" is not in the list.";
                }
            }//End of for loop

        }//end of try
        catch (NullPointerException e) {

        }//End of catch        
        System.out.println(f);
        return found;
    }//End of isIn method
    //Postcondition: return the value of found

    //Precondition: An Object variable is needed for the parameters.
    /*  initialize  local varible to i to 0
     * A try catch block is needed. If there is a null value in the list, 
     * the complier will throw a null pointer exception  when we try to use the .equals method 
     * on the elements of the list where the value is null
     * use the local variable to help loop though the array
     * If value at the current location is equal to the incoming object break the loop the object is found.
     * Prints a message that said what object you where looking for and return Object is in the list
     * This will return negative 1 which means not in the list
     * i + 1 then subtract  i leaves a negative (-1)
     * Prints a message that said what object you where looking for and return Object is not in the list
     */
    public int find(Object n) {

        int i = 0;
        String f = "";
        if (isIn(n)) {
            try {
                for (i = 0; i < myArray.length - 1; i++) {
                    if (myArray[i].equals(n)) {
                        f = "Object: \"" + n + "\" found.";
                        break;
                    } else {
                        f = "Object: \"" + n + "\" was not found.";
                    }//End of if
                }//end of the for loop

            } //End of the try
            catch (NullPointerException e) {
                System.out.println(f);
            }//End of the catch    
        }
        return i;

    }//end if find
    //Postcondition:   //return the value of i

    //Precondition: An Object variable is needed for the parameters.  
    /*The find() method is called with the incoming Object value from the parameter 
     * The find() method will return a int value that is holding the index of the object we want to remove
     *  find returns -1 if the Object is not in the list
     * if find() returns a postive number 0 or greater that index is removed else a message is printed
     * saying the object was not found. 
     */
    public void remove(Object n) {
        String f = "";
        int i = find(n);
        if (i == myArray.length) {
            f = "Object: \"" + n + "\" is not in the list.";
        }//
        if ((i >= 0) || i != myArray.length) {
            myArray[i] = null;
            f = "Object: \"" + n + "\" was removed from the list.";
        }
        //end of else
        System.out.println(f);
    }//End of remove method
//Postcondition: None
//Precondition: None
    /* This method use the object superclass methods to return the length of the arrayList
     */

    //Empty the list
    public void emptyTheArray() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = null;
        }//end of for loop
    }//end of emptyTheArray

    public int Capacity() {
        return myArray.length;
    }//end of method
    //Postcondition: An int value with the total number of indexes in the array
}//End of the ArrayList Class
