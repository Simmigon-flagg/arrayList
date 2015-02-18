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
        //Use Default value inside consturcor
        ArrayList myA = new ArrayList(3);
        
        for (int i = 0; i < myA.Capacity(); i++) {
            System.out.println(myA.get(i));

        }

    }
}
