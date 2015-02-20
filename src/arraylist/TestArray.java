
/*   
 Purpose (one for each class that specifically defines that that class does): 

    - The purpose of this program is to do some operation on an array of random numbers
    - An initial array of random numbers will be created and populated...
    - The random numbers are to be sorted in ascending order and the summed....
   
    - The output should look like: 
     "The unsorted array is: 1, 4, 5, 62, 1, 53, 32"
     "The sorted array is: 1, 1, 4, 5, 32, 53, 62"
     "The sum is: 158"   
   
 Solution: 

    - Create an empty array, of the required length
    - Create a random number generator
    - In a for loop, insert random numbers into the array
    - Call PrintArray to print the array
    - Call SortArray to sort the array, using selection sort
    - Call PrintArray to print the array
    - Call SumArray to get the sum of the array
    - Print the sum of the array
  
 Data structures to be used: 
       - One array
           - One array to hold the randomly generated numbers
       - For larger programs, list any other data structures and what they're used for
           
 Description of how to use program and expected input/output:
       - The program does not require any user input.
       - The program will output three lines of text containing:
            - The original array
            - The sorted array
            - The sum of the array
 */



    
    //Initializes all private variables required for the program


        //Create a random number generator

    
        //Use a for loop to insert random numbers into the array

    
    //Precondition: Takes an integer array
    //Postcondition: No return.  Prints the array to the console/screen
 

    //Precondition: Takes a class level integer array
    //Postcondition: No return.  Sorts the array from smallest to largest
   
    
    //Precondition: Takes an integer array
    //Postcondition: Returns he sum of the array, as an integer
 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Simmigon Flagg
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create an array of 5 Object
        ArrayList myA = new ArrayList(5);
        //See if the element is 
        System.out.println("This list is empty: " + myA.isEmpty());
         System.out.println("This list is full: " + myA.isFull());
        System.out.println();
        System.out.println("_______________________________________________________________________");
        System.out.println("Maximum Length of the array: " + myA.Capacity());
         System.out.println("Number of elements in the array: " + myA.size());
        System.out.println("_______________________________________________________________________");

        //Added six object 
        myA.add("Simmigon");
        //Test add(methods) with parameters
        myA.add(1, "Daril");
        myA.add("Flagg");
        myA.add("Denzel");
        myA.add("Junk");
        System.out.println();
        System.out.println("_______________________________________________________________________");
        //The can hold five elements
        myA.add("Trash");
        System.out.println("Tried to add trash to the list.");
        System.out.println("_______________________________________________________________________");
        myA.add(11, "Toshiba");
        System.out.println("Tried to add Toshiba to index 11 but there are only "+myA.Capacity()+" slots.");
        System.out.println("_______________________________________________________________________");
        System.out.println("Element(s) in list:");
        System.out.println("Print all the elements in the list.");
        System.out.println("_______________________________________________________________________");
         System.out.println("This list is Full: " + myA.isFull());
        //Use get to see the element in an index
        
        for (int i = 0; i < myA.Capacity(); i++) {
            System.out.println(myA.get(i));
        }
        System.out.println("_______________________________________________________________________");
        System.out.println();
        // Remove an element
        myA.remove("Junk");
        System.out.println("Remove Junk. Check to see if Junk is in the list first then remove it.");
        System.out.println("_______________________________________________________________________");
        System.out.println();
        for (int i = 0; i < myA.Capacity(); i++) {
            System.out.println(myA.get(i));
        }
        System.out.println("_______________________________________________________________________");
        System.out.println();
        //Returns the index of the object

        System.out.println("Size:" + myA.size());
        System.out.println("Get the number of element in the array.size will not count null.");
        System.out.println("_______________________________________________________________________");
        System.out.println();

        System.out.println("Flagg is at index " + myA.find("Flagg") + ".");
        System.out.println("Find Flagg ,then print which position flagg is at in the list.");
        System.out.println("_______________________________________________________________________");
        System.out.println("Read the elements in the list to see if 3410 is in the list.");
        System.out.println(myA.isIn("3410"));
        System.out.println("_______________________________________________________________________");
        System.out.println("Read the elements in the list to see if Denzel is in the list.");
        System.out.println(myA.isIn("Denzel"));
        System.out.println("_______________________________________________________________________");

    }
}
