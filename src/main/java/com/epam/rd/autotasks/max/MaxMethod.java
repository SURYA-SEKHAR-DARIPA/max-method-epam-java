package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {

        int maximum=values[0];
        for(int i=1;i<values.length;i++){
            if(values[i]>maximum){
                maximum=values[i];
            }
        }
        return maximum;
        //throw new UnsupportedOperationException();
    }
}
