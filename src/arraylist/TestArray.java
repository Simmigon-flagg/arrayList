/*
 Documentation:
    1.     Purpose

            The purpose of this assignment is to write the ArrayList 
            Data Structure along with helper method to support and implement 
            the ArrayList functionality. We will create, read, 
            update and delete objects from an arraylist.                
==============================================================================
 2.     Solution

    - Declare a private class level Object array
    - Create a default construction that initialize the array to size ten  
    - Create a construction that initialize the array to a user define value  
    - Create a method for adding elements to the end of an array that 
      takes in an object as its parameter    
    - Create a method for adding elements to a location in an array   
    - Create a method for retrieving object from an array that takes 
      in a int into its parameters and return the element
    - Create a method that counts the number of Objects
      in the array then return a int value
    - Create a isEmpty helper method to see if the array is empty
    - Create a isFull helper method to see if the array is Full
    - Create method isIn to loop though the elements for a matching 
      Object that return a boolean value
    - Create method find to loop though the elements for a matching 
      Object that return a int value
    - Create a method that takes in an object and remove it from the list
    - Create a method to print the array
    - Create a method to print all the objects in the array
    - Create a method to print the number of indexs in the array
    - Create a method to print the array


emptyTheArray
  

Description:
        Algorithms
                    List data structures
                        - An array                               
                                a) This allows us to store a collect of related data.
                    Expected input/output
                        - add(Object x)
                                a) input:Object                                         
                                b) output: void
                                   Print to Screen
                                   Object: was not added.
                                           or
                                           was added.
                                   
                        - add(int index, Object x)
                                a) input: int and Object
                                b) output: void
                                   Print to Screen
                                    Object: was added.
                                    or
                                    Slot is occupied 
                                    Object was not add to index 
                                    or
                                    Slot "indexed" does not exist.
                                    Object: was not added to the list.
                                    
                        - get(int index) 
                                a) input: int                                   
                                b) output: Object
                                   The Object at that index position
                        - size()
                                a) input: empty
                                b) output: int
                                   Prints all Objects that are not null
                        - isEmpty()
                                a) input: empty
                                b) output: boolean
                                   True 
                                   or
                                   false
                        - isFull()
                                a) input: empty
                                b) output: boolean
                                   True 
                                   or
                                   false
                        - isIn(Object ob)
                                a) input: Object
                                b) output: boolean
                                   True 
                                   or
                                   false
                        - find(Object n)  
                                a) input: Object                                
                                b) output: void
                                   Returns an int position of
                                           the object's index
                                   Returns -1                                          
                                   Prints to the Screen
                                   Object: found.
                                   or
                                   Object: not found.
                
                        - remove(Object n) 
                                a) input: Object                                    
                                b) output: void
                                Object: was removed from the list.
                                or
                                Object: was not removed from the list.
                        - isFull()
                                a) input: empty
                                b) output: boolean
                                   True 
                                   or
                                   false
                        - isIn(Object ob) 
                                a) input: Object
                                b) output: boolean
                                True 
                                or
                                false
                        - emptyTheArray() 
                                a) input: empty
                                b) output: void
                                    Print to the screen
                                    Array emptied
                        - Capacity() 
                                a) input: empty
                                b) output: int
                                   Returns the total number of index

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

public class TestArray {

    public static void main(String[] args) {

        // create an array of 5 Object
        ArrayList myA = new ArrayList();
        //See if the element is 
        System.out.println("=======================isEmpty()==AND===isFull()=============================");
        System.out.println("This list is empty: " + myA.isEmpty());
        System.out.println("This list is full: " + myA.isFull());
        System.out.println();
        System.out.println("=======================Capacity()===AND==size()=============================");
        System.out.println("Maximum Length of Objects the array can hold: " + myA.Capacity());
        System.out.println("Object array content are all initialize to \"null\".");
		//Call printArray which prints the elements and the null values
        myA.printArray();
        System.out.println("Number of elements in the array: " + myA.size() + "\n");
        System.out.println("=======================add(Object obj)==AND===add(int i, Object obj)=====");

        //Added six object 
	    //Test add(Object ob) with one parameters.
        myA.add("Simmigon");
        //Test add(int i,Object ob) with two parameters.
        myA.add(3, "Daril");
        myA.add("Flagg");
        myA.add("Denzel");
        myA.add("Junk");
        System.out.println();
         myA.printArray();
        System.out.println("=======================printElements()=============================");
        System.out.println("Element(s) in list:");
        System.out.println();
		//Call printElements which prints only the elements and NOT the null values
        myA.printElements();
        System.out.println();
        System.out.println("=======================size()===================================");
        //Returns the index of the object
        System.out.println("Get the number of element in the array.The size() method will not count null.");
		//size return an int value representing the number of elements in the arraylist.
        System.out.println("Size:" + myA.size());
        System.out.println();
        System.out.println("=======================add(Object obj) INTO FULL LIST==================");
        //The can hold five elements
        System.out.println("Try to add Trash to the list.");
        myA.add("Trash");
        System.out.println();
        System.out.println("=======================add(int i,Object obj) INTO INDEX THAT IS OCCUPIED========");
        System.out.println("Try to add Android to index 0.");
		//Test add(int i,Object ob) with two parameters.
        myA.add(0, "Android");
        System.out.println();
        System.out.println("=======================add(int i,Object obj) NO SUCH INDEX==================");
        System.out.println("Try to add Toshiba to index 11 but there are only " + myA.Capacity() + " slots.");
		//Test add(int i,Object ob) with two parameters.
        myA.add(11, "Toshiba");
        System.out.println();
        System.out.println("=======================printElements(int i,Object obj)=====================");
        System.out.println("Element(s) in list:");
        System.out.println();
        //Call printElements which prints only the elements and NOT the null values
        myA.printElements();
        System.out.println();
        System.out.println("=======================remove(Object obj)=====================");

        //Remove an Object from the arraylist     
        myA.remove("Junk");
        System.out.println();
		//Call printElements which prints only the elements and NOT the null values
        myA.printElements();
        System.out.println();
        System.out.println("=======================remove(Object obj)=====================");

        System.out.println("Remove a value that is not in the list");
		//Remove an Object from the arraylist
        myA.remove("Aliens");
        System.out.println();
		//Call printElements which prints only the elements and NOT the null values
        myA.printElements();
        System.out.println();
        System.out.println("=======================find()=====================");
        System.out.println("Find Flagg ,then print which position Flagg is at in the list.");
		//Looks for the Object and returns a index
        System.out.println("Flagg is at index " + myA.find("Flagg") + ".");
        System.out.println();
        System.out.println("=======================find()=====================");
        System.out.println("Find David ,then print which position David is at in the list.");
		//Looks for the Object and returns a index
        System.out.println("David is at index " + myA.find("David") + ".");
        System.out.println();
        System.out.println("=======================isIn()=====================");
        System.out.println("Read the elements in the list to see if 3410 is in the list.");
		//Checks to see if the Object is in the arraylist
        System.out.println(myA.isIn("3410"));
        System.out.println();
        System.out.println("=======================isIn()=====================");
        System.out.println("Read the elements in the list to see if Denzel is in the list.");
		//Checks to see if the Object is in the arraylist
        System.out.println(myA.isIn("Denzel"));
        System.out.println();
        System.out.println("=======================emptyTheArray()==AND===printArray()================");
        System.out.println("Reset the object array back to all null value");
		//Call emptyTheArray which sets all the indexes in the arraylist to null values.
        myA.emptyTheArray();
        System.out.println();
		//Call printArray which prints the elements and the null values
        myA.printArray();

    }
}
