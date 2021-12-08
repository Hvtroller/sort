package com.example;

public class SortFactory {
    public static Sortable generateSorter(String name) {
        switch (name) {
            case "bubble":
                return new BurbleSort();
            case "insertion":
                return new InsertionSort();
            case "selection":
                return new SelectionSort();
            default:
                return new BurbleSort();
        }
    }
}
