/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author Flagg
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Use Default value inside consturcor
        ArrayList theArray = new ArrayList();

        theArray.add("Simmigon");
        theArray.add("Flagg");
        theArray.add("Age: 34");
        theArray.add("Simmigon");
        theArray.add("Flagg");
        theArray.add("Age: 34");
        theArray.add("Simmigon");
        theArray.add("Flagg");
        theArray.add("Jovy");
        theArray.add("Cortez");
        theArray.add("Age: 23");


        for (int i = 0; i < theArray.size(); i++) {

            System.out.println(i + " " + theArray.get(i));

        }
        ArrayList theArrayPlace = new ArrayList();
        theArrayPlace.add(0, "Simmigon");
        theArrayPlace.add(2, "Flagg");
        theArrayPlace.add(3, "Age");
        theArrayPlace.add(3, "34");
        theArrayPlace.add(1, "Daril");
        theArrayPlace.add("Simmigon");



        for (int i = 0; i < theArray.size(); i++) {
            System.out.println(i + " " + theArrayPlace.get(i));
        }
        System.out.println(theArrayPlace.size());

    }
}
