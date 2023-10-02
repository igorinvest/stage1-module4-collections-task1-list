package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linked = new LinkedList<>();
        for (int i = 0; i < sourceList.size() ; i++) {
            int item = sourceList.get(i);
            if(item % 2 == 0)
                linked.addLast(item);
            else
                linked.addFirst(item);
        }
        return linked;
    }
}
