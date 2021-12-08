package com.example;

import java.util.Arrays;

public class InsertionSort extends Sortable{
    @Override
    public void sort(int[] data) {
        for(int i = 1; i < data.length; i++) {
            int j = i;
            while(j > 0 && data[i] < data[j - 1]) {
                j--;
            }
            insert(data, i, j);
        }
    }

    private void insert(int [] data, int index, int insertTo) {
        int temp = data[index];
        for(int i = index; i > insertTo; i--) {
            data[i] = data[i - 1];
        }
        data[insertTo] = temp;
    }
}
