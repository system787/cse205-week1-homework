package hoang.vincent.cse205;

// CLASS: Main
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import hoang.vincent.cse205.problems.H01_31;
import hoang.vincent.cse205.problems.H01_34;
import hoang.vincent.cse205.problems.H01_35;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        // System.out.println("Testing H01_31");
        // testH01_31();
        // System.out.println("Testing HO1_34");
        // testH01_34();
        System.out.println("Testing H01_35");
        testH01_35();
    }

    private void testH01_31() {
        H01_31 test01 = new H01_31();


        List<Integer> testList = test01.arrayListInit();

        for (Integer i : testList) {
            System.out.println(i.toString());
        }
    }

    private void testH01_34() {
        H01_34 test02 = new H01_34();


        System.out.println(test02.arrayListSum(null));

        ArrayList<Integer> testList = new ArrayList<>();

        System.out.println(test02.arrayListSum(testList));

        for (int i = 1; i < 6; i++) {
            testList.add(i);
        }

        System.out.println(test02.arrayListSum(testList));

    }

    private void testH01_35() {
        H01_35 test03 = new H01_35();

        System.out.println("pLen 5, pInitValue 123");

        ArrayList<Integer> list = test03.arrayListCreate(5, 123);

        System.out.println("List Size: " + list.size());

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("pLen 7, pInitValue 2");

        list = test03.arrayListCreate(7, 2);

        System.out.println("List Size: " + list.size());

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("pLen -1, pInitValue 0 -- list is null");

        list = test03.arrayListCreate(-1, 0);

        System.out.println(list == null);
    }

}