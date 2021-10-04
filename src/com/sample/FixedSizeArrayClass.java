package com.sample;

public class FixedSizeArrayClass {
    private static int[] objectArr = new int[5];
    private static int count = 0;

    FixedSizeArrayClass(){
        int size = FixedSizeArrayClass.count++;
        FixedSizeArrayClass.objectArr[size] = size;
    }

    public static int[] getObjectArr() {
        return objectArr;
    }
}
