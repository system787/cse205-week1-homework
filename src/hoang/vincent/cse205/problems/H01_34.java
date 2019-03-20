// CLASS: H01_34
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import java.util.ArrayList;

public class H01_34 {

    public H01_34() {

    }

    public Integer arrayListSum(ArrayList<Integer> pList) {
        if (pList == null || pList.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (Integer i : pList) {
            sum += i.intValue();
        }

        return sum;
    }
}
