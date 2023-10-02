package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    ListComparator comp = new ListComparator();
    public void sort(List<String> sourceList) {
        int size = sourceList.size();
        for (int j = 0; j < size / 2 + size; j++) {
            for (int i = 1; i < size; i++) {
                String a = sourceList.get(i-1);
                String b = sourceList.get(i);
                int biggerOne = comp.compare(a, b);
                if(biggerOne == 0) {
                    sourceList.set(i-1, b);
                    sourceList.set(i, a);
                } else {
                    sourceList.set(i-1, a);
                    sourceList.set(i, b);
                }
            }
        }
    }
}

class ListComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int formulaA = 5 * intA * intA + 3;
        int formulaB = 5 * intB * intB + 3;
        if(formulaA >= formulaB) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
