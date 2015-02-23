package arraylist;

/**
 *
 * @author Simmigon Flagg
 */
public class TestArray {

    public static void main(String[] args) {

        // create an array of 5 Object
        ArrayList myA = new ArrayList(5);
        //See if the element is 
        System.out.println("=======================isEmpty()==AND===isFull()=============================");
        System.out.println("This list is empty: " + myA.isEmpty());
        System.out.println("This list is full: " + myA.isFull());
        System.out.println();
        System.out.println("=======================Capacity()===AND==size()=============================");
        System.out.println("Maximum Length of Objects the array can hold: " + myA.Capacity());
        System.out.println("Object array content are all initialize to \"null\".");
        myA.printArray();
        System.out.println("Number of elements in the array: " + myA.size() + "\n");
        System.out.println("=======================add(Object obj)==AND===add(int i, Object obj)=====");

        //Added six object 
        myA.add("Simmigon");
        //Test add(methods) with parameters
        myA.add(1, "Daril");
        myA.add("Flagg");
        myA.add("Denzel");
        myA.add("Junk");
        System.out.println();
        System.out.println("=======================printElements()=============================");
        System.out.println("Element(s) in list:");
        System.out.println();
        myA.printElements();
        System.out.println();
        System.out.println("=======================size()===================================");
        //Returns the index of the object
        System.out.println("Get the number of element in the array.The size() method will not count null.");
        System.out.println("Size:" + myA.size());
        System.out.println();
        System.out.println("=======================add(Object obj) INTO FULL LIST==================");
        //The can hold five elements
        System.out.println("Try to add Trash to the list.");
        myA.add("Trash");
        System.out.println();
        System.out.println("=======================add(int i,Object obj) INTO INDEX THAT IS OCCUPIED========");
        System.out.println("Try to add Android to index 0.");
        myA.add(0, "Android");
        System.out.println();
        System.out.println("=======================add(int i,Object obj) NO SUCH INDEX==================");
        System.out.println("Try to add Toshiba to index 11 but there are only " + myA.Capacity() + " slots.");
        myA.add(11, "Toshiba");
        System.out.println();
        System.out.println("=======================printElements(int i,Object obj)=====================");
        System.out.println("Element(s) in list:");
        System.out.println();
        //Use get to see the element in an index
        myA.printElements();
        System.out.println();
        System.out.println("=======================remove(Object obj)=====================");

        // Remove an element        
        myA.remove("Junk");
        System.out.println();
        myA.printElements();
        System.out.println();
        System.out.println("=======================remove(Object obj)=====================");

        System.out.println("Remove a value that is not in the list");
        myA.remove("Aliens");
        System.out.println();
        myA.printElements();
        System.out.println();

        System.out.println("=======================find()=====================");
        System.out.println("Find Flagg ,then print which position flagg is at in the list.");
        System.out.println("Flagg is at index " + myA.find("Flagg") + ".");
        System.out.println();
        System.out.println("=======================find()=====================");
        System.out.println("Find David ,then print which position David is at in the list.");
        System.out.println("David is at index " + myA.find("David") + ".");
        System.out.println();
        System.out.println("=======================isIn()=====================");
        System.out.println("Read the elements in the list to see if 3410 is in the list.");
        System.out.println(myA.isIn("3410"));
        System.out.println();
        System.out.println("=======================isIn()=====================");
        System.out.println("Read the elements in the list to see if Denzel is in the list.");
        System.out.println(myA.isIn("Denzel"));
        System.out.println();
        System.out.println("=======================emptyTheArray()==AND===printArray()================");
        System.out.println("Reset the object array back to all null value");
        myA.emptyTheArray();
        System.out.println();
        myA.printArray();

    }
}
