// CLASS:  H01_31
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import java.util.ArrayList; // Import any required classes so your code will build


public class H01_31 { // Remember that class name and filename have to be the same. Case matters.

    public H01_31() { // Provide a default constructor. Some exercises may require other ctors.

    }

    // This is the method you are asked to write for Ex. 3.1. Name it exactly as requested.
    public ArrayList<Integer> arrayListInit() {
        // 1. Declare and instantiate an ArrayList<Integer> object named list.
        // 2. Write single for/while loops or a pair of for/while loops to fill list with the specified values. // 3. Return list.
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {
                list.add(j);
            }

        }

        return list;
    }
}