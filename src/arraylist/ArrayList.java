/*
 Documentation:
    1.     Purpose - 13%.
            The purpose of this assignment is to write the ArrayList Data Structure 
             along with helper method to support and implement the ArrayList functionality.

            /////////////////////////////////Add more here////////////////////////////////////////////
    
Output from TestArray
===============================================
 This list is empty: true

 ___________________________
 Maximum Length of the array: 5
 ___________________________
 Object: "Simmigon" was added.
 Object: "Daril" was added.
 Object: "Flagg" was added.
 Object: "Denzel" was added.
 Object: "Junk" was added.

 ___________________________
 Object: "Trash" was not added.
 Tried to add trash to the list.
 ___________________________
 Slot "10" does not exist.
 Object: "Toshiba" was not place into a list.
 Tried to add Toshiba to index 10 but  there are only 5 slots.
 ___________________________
 Element(s) in list:
 Print all the elements in the list.
 ___________________________
 Simmigon
 Daril
 Flagg
 Denzel
 Junk
 ___________________________

 Object: "Junk" is in the list.
 Object: "Junk" was removed from the list.
 Remove Junk. Check to see if Junk is in the list first then remove it.
 ___________________________

 Simmigon
 Daril
 Flagg
 Denzel
 null
 ___________________________

 Size:4
 Get the number of element in the array.size will not count null.
 ___________________________

 Object: "Flagg" is in the list.
 Flagg is at index 2.
 Find Flagg ,then print which position flagg is at in the list.
 ___________________________
 Read the elements in the list to see if 3410 is in the list.
 Object: "3410" is not in the list.
 false
 ___________________________
 Read the elements in the list to see if Denzel is in the list.
 Object: "Denzel" is in the list.
 true
===============================================
 2.     Solution - 16%

                        - Declare a private class level Object array
                        - Create a default construction that initialize the array to size ten  
                        - Create a construction that initialize the array to a user define value  
                        - Create a method for adding elements to the end of an array 
                           that takes in an object as its parameter
                           If the array is Empty place the object at index 0 
     * else If the last value in the list is an object "Full" is printed to the Screen
     * else start from end of the list and move backwards until you reach the first object from the end 
     * if the value is not null the if statement executes it's body otherwise if null is true 
     *the body of the if statement is skipped
     * The updated variable i is increment before assigning the Object to the list 
     * then break out of the current loop

                        - Create a method for adding elements to a location in an array 
                           that takes in a int and an object as its parameter
 /*The int variable will insert the Object in the location specified by the index
     * If the value at the index is null then we replace that value with the incoming Object x
     * else we send a message Saying that Slot is occupied. If the user tries to place a object in a index that
     * is out of  bound a try catch block is used to print a message. Slot does not exist

                        - Create a method for retrieving object from an array that takes 
                            in a int into its parameters and return the element

                        - Create a method that counts the number of elements (Objects)
                            in the array then return a int value
/* Size take no argument  a count is initialized to zero
     * A for loop starts from 0 and iterates thought all the elements in the list
     * if the current value at the iteration of the loops is not null, count will be increment by 1
     *  Set a Local varible count to zero
     *  Start a for loop to iteration thought at the indexes of the array
     *  Check for Object if an object is found increment count by 1
     *
                        - Create a  helper method to see if the array is empty
  /* initialized a boolean expression to true
     * Start a for loop to iteration thought at the indexes of the array
     * If the value at that current location in the loop is not null 
     * set empty to false and break the loop to stop searching.
                        - Create a  helper method to see if the array is Full

                        - Create a method isIn to loop though the elements for a matching 
                           Object that return a boolean value
  /*initialized a boolean expression to false A try catch block is needed.
     * If there is a null value in the list, the complier will throw a null pointer 
     * exception  when we try to use the .equals method on the elements of the list where the value is null
     * Start a for loop to iteration thought at the indexes of the array
     * If the incoming object from the parameter equal the content in the index printmessage Obect is in the list.
     * set found to true and break the loop. We only need the first occurrence
     * This will print the Object: is not in the list. when a null value is incurred

                        - Create a method to search though the array that take in an object
                           find that object and returns the objects location
/*  initialize local varible to i to 0
     * A try catch block is needed. If there is a null value in the list, 
     * the complier will throw a null pointer exception  when we try to use the .equals method 
     * on the elements of the list where the value is null
     * use the local variable to help loop though the array
     * If value at the current location is equal to the incoming object break the loop the object is found.
     * Prints a message that said what object you where looking for and return Object is in the list
     * This will return negative 1 which means not in the list
     * i + 1 then subtract  i leaves a negative (-1)
     * Prints a message that said what object you where looking for and return Object is not in the list

                       - Create a method that takes in an object and remove it from the list
/*The find() method is called with the incoming Object value from the parameter 
     * The find() method will return a int value that is holding the index of the object we want to remove
     *  find returns -1 if the Object is not in the list
     * if find() returns a postive number 0 or greater that index is removed else a message is printed
     * saying the object was not found. 

Description:
        Algorithms - 16%
                    List data structures - 5%.
                        - An array                               
                                a) This allows us to store a collect of related data.
                    Expected input/output - 5%
                        - add(Object x)
                                a) input:Object

                                b) output: void
                        - add(int index, Object x)
                                a) input: int and Object
                                b) output: void
                        - get(int index) 
                                a) input: int 
                                b) output: Object
                        - size()
                                a) input: empty
                                b) output: int
                        - isEmpty()
                                a) input: empty
                                b) output: boolean
                        - isFull()
                                a) input: empty
                                b) output: boolean
                        - isIn(Object ob)
                                a) input: Object
                                b) output: boolean
                        - find(Object n)  
                                a) input: Object
                                b) output: void
                        - remove(Object n) 
                                a) input: Object
                                b) output: void
                        - isFull()
                                a) input: empty
                                b) output: boolean
                        - isIn(Object ob) 
                                a) input: Object
                                b) output: boolean
                        - emptyTheArray() 
                                a) input: empty
                                b) output: void
                        - Capacity() 
                                a) input: empty
                                b) output: int

 5.      Purpose of the class(es):
            a) ArrayList: - abstract the arrayList method for code reuse in other 
                                    programs using OOP methogies.

                                  - create a list of object and perform 
                                     action on those object

            b) TestArray  - test the methods of ArrayList and print easier to read 
                                     message for better understanding of what is excpted of 
                                     the methods   

                                  - TestArray will also test each method including helper methods to ensure
                                     the methods are returning the correct values.     


 */
package arraylist;

public class ArrayList {

    //Declare a private array of objects.
    private Object[] myArray;

    //Precondition: None
    //Postcondition: An array of objects size ten.
    public ArrayList() {
        myArray = new Object[10];
    }// End of default constructor 

    //Precondition: An int value is needed for the parameters.
    //Postcondition:Returns void. The Array Capacity will be set to variable n
    public ArrayList(int n) {
        myArray = new Object[n];
    }//// End of constructor

    //Precondition: An Object x value is needed for the parameters.
    //Postcondition: Returns void: prints a messsage to the screen/console "was or was not added"
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

    //Precondition: An int variable and an Object value is needed for the parameters.
    //Postcondition: Returns void: prints a messsage to the screen/console "was added or was placed or not placed"
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

    //Precondition: An int value is needed for the parameters.
    //Postcondition: Returns element of type Object  
    public Object get(int index) {
        return myArray[index];
    }//End of get method

    //Precondition: no data types value needed for the parameters.
    //Postcondition: Returns an int value count.
    public int size() {
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null) {
                count++; 
            }//End of if
        }//End of for loop
        return count;
    }//End of size method
  
    //Precondition: None
    //Postcondition: Returns a boolean value
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
    
    //Precondition: None
    //Postcondition: Returns a boolean value
    public boolean isFull() {
        boolean full = false;
        if (size() == Capacity()) {
            full = true;
        } 
        return full;

    }// End of isFull method
  
     //Precondition: An object variable is needed for the parameters.
     //Postcondition: Returns a boolean value prints to the console is in or not is not the list
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
    
    
  
    //Precondition: An Object value is needed for the parameters.
    //Postcondition: Return the an int value that matches the index for the incomming object
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

    //Precondition: An object value is needed for the parameters.  
    //Postcondition: Returns void. Prints to the console a message
    //not in the list or was removed from the list
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

    //Precondition: None
    //Postcondition: Returns void
    public void emptyTheArray() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = null;
        }//end of for loop
    }//end of emptyTheArray

    //Precondition: None
    //Postcondition: Returns an int value which is the total number of indexes in the array.
    public int Capacity() {
        return myArray.length;
    }//end of method
    
}//End of the ArrayList Class
