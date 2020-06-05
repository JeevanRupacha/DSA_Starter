package com.play;

import org.w3c.dom.ls.LSOutput;
class ClassSecond {
    public static boolean comp(int[] a, int[] b) {
        boolean isPresent = true;

        for (int num : b) {
            if (containsNum(a, (int) Math.sqrt(num))) {
                isPresent = true;
            } else {
                isPresent = false;
            }
        }


        return isPresent;
    }

    private static boolean containsNum(int[] a, int sqrt) {

        for (int num : a) {
            if (num == sqrt) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }

}