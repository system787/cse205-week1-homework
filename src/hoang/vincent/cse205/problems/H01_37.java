package hoang.vincent.cse205.problems;

import java.util.ArrayList;

public class H01_37 {

    public H01_37() {

    }

    public void arrayListRemove(ArrayList<Integer> pList, int pValue) {
        pList.removeIf(n -> n == pValue);
    }
}
