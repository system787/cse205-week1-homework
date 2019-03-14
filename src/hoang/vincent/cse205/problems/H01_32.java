package hoang.vincent.cse205.problems;

import java.util.ArrayList;
import java.util.List;

public class H01_32 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }

        System.out.println("Input Array: ");

        for (Integer i : list) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; ++i) {
            list.set(i, list.get(i) + list.get(i - 1));
        }

        System.out.println("Modified List: ");

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
