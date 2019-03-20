package hoang.vincent.cse205.problems;

// CLASS: H01_37
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import java.util.ArrayList;

public class H01_37 {

    public H01_37() {

    }

    public void arrayListRemove(ArrayList<Integer> pList, int pValue) {
        pList.removeIf(n -> n == pValue);
    }
}
