package task2;

import java.util.ArrayList;

public class Test<T> {
    private static ArrayList list;
    private static String[] arr = {"eee", "rrr", "bnm"};
    private static Integer[] arr2 = {1, 2, 3};

    public static void main(String[] args) {
        ArrayToArrList obj = new ArrayToArrList();
        list = obj.makeList(arr);
        System.out.println(list);
        list = obj.makeList(arr2);
        System.out.println(list);
    }
}
