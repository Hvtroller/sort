package com.example;

import java.util.Arrays;

public class BurbleSort extends Sortable{
    @Override
    public void sort(int[] data) {
        for(int i = data.length - 1; i > 0; i--) {
            int j  = 0;
            boolean swap = false;
            while(j < i) {
                if(data[j] > data[j + 1]) {
                    swap = true;
                    swap(data, j, j + 1);
                }
                j++;
            }
            if(swap == false) {
                break;
            }
        }
    }


}
