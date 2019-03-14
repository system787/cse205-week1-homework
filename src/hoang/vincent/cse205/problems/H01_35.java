package hoang.vincent.cse205.problems;
// CLASS: H01_35
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import java.util.ArrayList;

public class H01_35 {
    public H01_35() {

    }

    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) {
        if (pLen >= 0) {
            ArrayList<Integer> list = new ArrayList<>(pLen);

            for (int i = 0; i < pLen; i++) {
                list.add(pInitValue);
            }

            return list;
        }

        return null;
    }
}
