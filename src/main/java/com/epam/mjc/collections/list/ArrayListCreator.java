package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int counter = 2;
        ArrayList<String> result = new ArrayList<>();
        while (counter < sourceList.size()) {
            result.add(sourceList.get(counter));
            result.add(sourceList.get(counter));
            counter = counter + 3;
        }
        return result;
    }
}
