package com.joejang.algorithm.practice.util;

import java.util.LinkedList;
import java.util.List;

public class ArrayUtil {
    public static int[][] listToArray(List<List<Integer>> list) {
        int[][] res;
        int length0 = list.size();
        int length1 = 0;
        if (length0 != 0) {
            length1 = list.get(0).size();
        }
        res = new int[length0][length1];

        for (int i = 0; i < length0; i++) {
            for (int j = 0; j < length1; j++) {
                res[i][j] = list.get(i).get(j);
            }
        }
        return res;
    }

    public static List<List<Integer>> arrayToList(int[][] array) {
        List<List<Integer>> res = new LinkedList<>();
        for (int[] ints : array) {
            List<Integer> list = new LinkedList<>();
            for (int j = 0; j < array[0].length; j++) {
                list.add(ints[j]);
            }
            res.add(list);
        }
        return res;
    }

    public static boolean listEquals(List<List<Integer>> list1, List<List<Integer>> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        if (list1.size() == 0) {
            return true;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).size() != list2.get(i).size()) {
                return false;
            }
            if (list1.get(i).size() != 0) {
                for (int j = 0; j < list1.get(i).size(); j++) {
                    if (!list1.get(i).get(j).equals(list2.get(i).get(j))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean arrayEquals(int[][] array1, int[][] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }
        if (array1.length == 0) {
            return true;
        }
        if (array1[0].length != array2[0].length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean listElemEquals(List<Integer> list1, List<Integer> list2) {
        return list1.containsAll(list2) && list2.containsAll(list1);
    }

    public static void printList(List<List<Integer>> list) {
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < list.get(0).size(); j++) {
                if (j == list.get(0).size() - 1) {
                    System.out.print(list.get(i).get(j));
                } else {
                    System.out.print(list.get(i).get(j) + ", ");
                }
            }
            if (i == list.size() - 1) {
                System.out.println("]");
            } else {
                System.out.println("],");
            }
        }
        System.out.println("]");
    }

    public static void printArray(int[][] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[0].length; j++) {
                if (j == array[0].length - 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(array[i][j] + ", ");
                }
            }
            if (i == array.length - 1) {
                System.out.println("]");
            } else {
                System.out.println("],");
            }
        }
        System.out.println("]");
    }
}
