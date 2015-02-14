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

        ArrayList theArrayWithSize = new ArrayList(2);

        theArray.add("Simmigon");

        System.out.println(theArray.isEmpty());

        for (int i = 0; i < theArray.size(); i++) {
            System.out.println(theArray.get(i));
        }



        System.out.println(theArray.size());
        for (int i = 0; i < theArray.size(); i++) {
            System.out.println(theArray.get(i));
        }

    }
}
