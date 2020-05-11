package com.codegym;

import java.util.*;

public class CollectionUtilsAdapter {
    public CollectionUtilsAdapter() {

    }


    public List<Integer> setToListAdapter (Set<Integer> setArray){
        List<Integer> mylist = new ArrayList<>();
        if(setArray.isEmpty()){
            mylist = new ArrayList<>();
        }else {
            Iterator<Integer> iterator = setArray.iterator();
            while (iterator.hasNext()) {
                 mylist.add(iterator.next());
            }

        }
        return mylist;
    }

}
