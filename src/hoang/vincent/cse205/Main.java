package hoang.vincent.cse205;

// CLASS: Main
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu

import hoang.vincent.cse205.problems.*;

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
        // System.out.println("Testing H01_35");
        // testH01_35();
        // System.out.println("Testing H01_36");
        // testH01_36();
        System.out.println("Testing H01_37");
        testH01_37();
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

    private void testH01_36() {
        H01_36 test04 = new H01_36();

        ArrayList<String> pList = new ArrayList<>();

        test04.insertName(null, "Null pList");
        test04.insertName(pList, null);

        // Normal name insertions
        String[] names = new String[]{ "James", "Kevin", "Cathy", "Catherine", "Jamie" };

        for (String s : names) {
            test04.insertName(pList, s);
        }

        // Multiple duplicate insertions
        for (int i = 0; i < 3; i++) {
            test04.insertName(pList, names[0]);
        }

        // End of list insertion
        test04.insertName(pList,"Zebra");
    }

    private void testH01_37() {
        H01_37 test05 = new H01_37();

        ArrayList<Integer> pList = new ArrayList<>();

        int[] testNumbers = new int[]{ 1, 1, 1, 1, 2, 3, 4, 5, 5, 6, 7, 7, 7, 8, 9, 9, 0 };

        int[] testMixedNumbers = new int[]{ 15, 1, 99, 7, 22, 66, 33, 44, 7};

        for (int n : testNumbers) {
            pList.add(n);
        }

        for (int n : testMixedNumbers) {
            pList.add(n);
        }



        System.out.println(dumpH01_37(pList));

        System.out.println("Removing all \'1\' from list");
        test05.arrayListRemove(pList, 1);
        System.out.println(dumpH01_37(pList));

        System.out.println("Removing all \'7\' from list");
        test05.arrayListRemove(pList, 7);
        System.out.println(dumpH01_37(pList));

        System.out.println("Removing non-existent number \'9999\' from list");
        test05.arrayListRemove(pList, 9999);
        System.out.println(dumpH01_37(pList));
    }

    private String dumpH01_37(ArrayList<Integer> pList) {
        StringBuffer sb = new StringBuffer("Current pList: ");


        for (int n : pList) {
            sb.append(n);
            sb.append(" ");
        }

        return sb.toString();
    }

}