package com.galvanize;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int total = 0;

        for (String str : args) {
            if (Integer.parseInt(str) > 0) {
                total += Integer.parseInt(str);
            }
        }

        System.out.println(total);
    }
}
