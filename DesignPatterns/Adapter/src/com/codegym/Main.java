package com.codegym;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(88);
        mySet.add(199);
        mySet.add(6);
        CollectionUtilsAdapter adapter = new CollectionUtilsAdapter();
        List myList = adapter.setToListAdapter(mySet);
        int maxNumber = new CollectionUtils().findMax(myList);
        System.out.println("Max number of list: "+maxNumber);
    }
}
