package com.example;

public abstract class Sortable {
    public abstract void sort(int [] data);
    public void swap(int [] data, int i, int j) {
        int t = data[i];
        data[i] = data[j];
        data[j] = t;
    }
}
