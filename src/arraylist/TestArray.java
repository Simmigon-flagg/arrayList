/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Flagg
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
        System.out.println();
        System.out.println("_______________________________________________________________________");
        System.out.println("Maximum Length of the array: " + myA.Capacity());
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
        myA.add(10, "Toshiba");
        System.out.println("Tried to add Toshiba to index 10 but  there are only 5 slots.");
        System.out.println("_______________________________________________________________________");
        System.out.println("Element(s) in list:");
        System.out.println("Print all the elements in the list.");
        System.out.println("_______________________________________________________________________");
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
