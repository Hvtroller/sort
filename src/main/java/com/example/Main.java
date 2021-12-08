package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test bubble sort");
        int [] data = new int[] {1,2,6,7,3,12,8,9,32};
        Sortable sorter = SortFactory.generateSorter("bubble");
        System.out.println("Sort type: " + sorter.getClass());
        sorter.sort(data);
        System.out.println(Arrays.toString(data));

        System.out.println("Test selection sort");
        data = new int[] {1,2,6,7,3,12,8,9,32};
        sorter = SortFactory.generateSorter("selection");
        System.out.println("Sort type: " + sorter.getClass());
        sorter.sort(data);
        System.out.println(Arrays.toString(data));


        System.out.println("Test insertion sort");
        data = new int[] {1,2,6,7,3,12,8,9,32};
        sorter = SortFactory.generateSorter("insertion");
        System.out.println("Sort type: " + sorter.getClass());
        sorter.sort(data);
        System.out.println(Arrays.toString(data));


    }
}
