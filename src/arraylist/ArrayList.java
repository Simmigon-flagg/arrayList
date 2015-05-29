
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
        //Set the amount Capacity to the parameter's int value
        myArray = new Object[n];
    }//// End of constructor

    //Precondition: An Object x value is needed for the parameters.
    //Postcondition: Returns void: prints a messsage to the screen/console "was or was not added"
    public void add(Object x) {
       //Delcare a string object and initialize it to an empty string
        String f = "";
        //If isEmpty return true execute the if statement
        if (isEmpty()) {
            //Assign the parameter value to the first index
            myArray[0] = x;
            //Assign a message
            f = "Object: \"" + x + "\" was added.\n";
        } //end of if  
        //Else if isEmpty returns false check the last index in the array
        // If the last index is (not null) then we can not add to the back of the array
        else if (myArray[Capacity()-1] != null) {
             //Assign a message
            f = "Object: \"" + x + "\" was not added.\n";
            
        }//end of else if 
        else {
            //If the last index is null start a for loop
            //from the end of the loop moving backward            
            for (int i = Capacity() - 1; i >= 0; i--) {
                //while moving backward in the loop if we find a Object
                //execute the body of the if statement
                if (myArray[i] != null) {                    
                    //Move the initiator forward one index and 
                    //add the parameter's value
                    myArray[++i] = x;
                     //Assign a message
                    f = "Object: \"" + x + "\" was added.\n";
                    //Exit the loop.
                    break;
                }//End of if
            }//end of for loop
        }//end of else
        //Print to the console the approach message
        System.out.print(f);
    }//End of add() method

    //Precondition: An int variable and an Object value is needed for the parameters.
    //Postcondition: Returns void: prints a messsage to the screen/console "was added or was placed or not placed"
    public void add(int index, Object x) {
        //Delcare a string object and initialize it to an empty string
        String f = "";
       //Use a try catch to keep the program from crashing when the parameter
       //int value is larger than array's Capacity.
        try {
            //If the parameter's int's value is null execute the body of the if statement
            if (myArray[index] == null) {
               //Assign a message
                f = "Object: \"" + x + "\" was added.";
                //Assign the parameter's object's value 
                //at the parameter's int's value
                myArray[index] = x;
            }//End of if
            //If the parameter's int's value is Not null execute the body of the if statement
            else {                
                 //Assign a message
                f = "Slot is occupied.\nObject: \"" + x + "\" was not add to index \"" + index + "\" in the list.";
            }//End of else
                 //The parameter's int's value was greater then the Capacity
        } catch (ArrayIndexOutOfBoundsException e) {
             //Assign a message
            f = "Slot \"" + index + "\" does not exist.\nObject: \"" + x + "\" was not added to the list.";
        }
        //Prints the approach message to the console.
        System.out.println(f);
    }// End of add()

    //Precondition: An int value is needed for the parameters.
    //Postcondition: Returns element of type Object.  
    public Object get(int index) {
        //Return the Object at the parameter's int's value location
        return myArray[index];
    }//End of get method

    //Precondition: no data types value needed for the parameters.
    //Postcondition: Returns an int value count.
    public int size() {
       //Delcare an int variable and initialize it to 0
        int count = 0;
        //Start a for loop to iterate the length of the array
        for (int i = 0; i < Capacity(); i++) {
            //If (Not null) is true at the iterator's value's content 
            //execute the body of the if statement
            if (myArray[i] != null) {
                //increment count variable
                count++; 
            }//End of if
        }//End of for loop
        //return's value
        return count;
    }//End of size method
  
    //Precondition: None
    //Postcondition: Returns a boolean value
    public boolean isEmpty() {
          //Delcare a boolean variable and initialize it to true
        boolean empty = true;
    //Start a for loop to iterate the length of the array
        for (int i = 0; i < Capacity(); i++) {
            //If (Not null) is true at the iterator's value's content
            //execute the body of the if statement
            if (myArray[i] != null) {
                //Set empty to false
                empty = false;
                //Exit the loop.
                break;
            }//End of if
        }//End of for
        return empty;
    }// End of isEmpty method
    
    //Precondition: None
    //Postcondition: Returns a boolean value
    public boolean isFull() {
         //Delcare a boolean variable and initialize it to false
        boolean full = false;
        //If the int value of size equal the Capacity of the lenght
        //is true execute the body of the if statment        
        if (size() == Capacity()) {
            //Set full to true
            full = true;
        } 
        return full;

    }// End of isFull method
  
     //Precondition: An object variable is needed for the parameters.
     //Postcondition: Returns a boolean value prints to the console is in or not is not the list
    public boolean isIn(Object ob) {
        //Delcare a boolean variable and initialize it to false
        boolean found = false; 
        //Use a try catch to keep the program from crashing when the parameter's
       //object's value is null
        try {
            //Start a for loop to iterate the length of the array
            for (int i = 0; i < Capacity(); i++) {
                //If the iterator's value's content is equal to the parameter's object's value 
                //execute the body of the if statement
                if (myArray[i].equals(ob)) {
                    //set found to true
                    found = true; 
                    //Exit the loop.
                    break;
                }//End of if
            }//End of for loop

        }//end of try
          //If the iterator's value's content is equal to null
         //it will be caught and the program will contiune to execute
        catch (NullPointerException e) {
 
        }//End of catch    
  return found;
    }//End of isIn method
    
    //Precondition: An Object value is needed for the parameters.
    //Postcondition: Return the an int value that matches the index for the incomming object
    public int find(Object n) {
       //Delcare an int and initialize it to -1
        int i = -1; 
        //Delcare a string object and initialize it to an empty string
        String f = "";
        //If isIn returns true execute the body of the loop
        if (isIn(n)) {
            //Use a try catch to keep the program from crashing when
            //the parameter's object's value is null
            try {
                //Start a for loop to iterate the length of the array
                for (i = 0; i < Capacity(); i++) {
                     //If the iterator's value's content is equal to the parameter's object's value 
                     //execute the body of the if statement
                    if (myArray[i].equals(n)) {
                         //Assign a message                        
                        f = "Object: \"" + n + "\" found.\n";
                        //exit the loop
                        break;
                       
                    }  //else if the iterator's value's is equal to the length
                        //of the array then we didn't find the 
                        //parameter's Object's value in the Object array
                    else  if(i == Capacity()){
                        //Assign a message
                        f = "Object: \"" + n + "\" was not found.\n";
                    }//End of if
                    
                }//end of the for loop

            } //End of the try
            //If the iterator's value's content is equal to null
         //it will be caught and the program will contiune to execute
            catch (NullPointerException e) {
                //Prints the approach message to the console.
                System.out.print(f);
            }//End of the catch    
        }else{
             //Assign a message
          f = "Object: \"" + n + "\" was not found.\n";       
        }
          //Prints the approach message to the console 
           System.out.print(f);
        return i;

    }//end if find

    //Precondition: An object value is needed for the parameters.  
    //Postcondition: Returns void. Prints a message to the console element
    //not in the list or was removed from the list
    public void remove(Object n) {
        
        //Delcare a string object and initialize it to an empty string
        String f = "";
        //Delcare a boolean variable and initialize it to 
        //the value returned by the isIn class method
        boolean intheList = isIn(n);
        //If intheList value is true execute the body of the if statement

        if (intheList) {
            //Use the int value that's returned from the class method find()
            //then set that parameter's Object's value to null
            myArray[find(n)] = null;
             //Prints the approach message to the console 
            System.out.print("Object: \"" + n + "\" was removed from the list.\n");
        }   else{
              //Prints the approach message to the console 
          System.out.print("Object: \"" + n + "\" was not found.\n");
        } 
    }//End of remove method

    //Precondition: None
    //Postcondition: Returns void
    public void emptyTheArray() {
        //Start a for loop to iterate the length of the array
        for (int i = 0; i < Capacity(); i++) {
            //use the iterator's value to 
            //assigns null to all index's content in the array
            myArray[i] = null; 
        }//end of for loop
         //Print to the console the approach message
         System.out.println("Array emptied");
    }//end of emptyTheArray

    //Precondition: None
    //Postcondition: Returns an int value which is the total 
    //number of indexes in the array.
    public int Capacity() {          
        return myArray.length;
    }//end of method
    
    //Precondition: None
    //Postcondition: Returns void prints all the elements in the array
    //That are not null to the console    
    public void printElements(){
      //Start a for loop to iterate the length of the array
    for (int i = 0; i < Capacity(); i++) {
            //If the iterator's value's content is not null
            //execute the body of the if statement
        if (myArray[i] != null) {
            //Print the iterator's value's content using 
            //the class method get().
            System.out.println(get(i));
        }//End of if   
        }//end of forloop
    }//end of printArray
    
    //Precondition: None
    //Postcondition: Returns void prints all the indexes in the array
    //To the console
    public void printArray(){
      //Start a for loop to iterate the length of the array.
    for (int i = 0; i < Capacity(); i++) {  
         //Print the iterator's value's content using 
         //the class method get().
            System.out.println(get(i));    
        }//end of forloop
    }//end of printArray
    
}//End of the ArrayList Class
