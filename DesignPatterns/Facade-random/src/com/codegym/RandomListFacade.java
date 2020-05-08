package com.codegym;

import java.util.List;
import java.util.Scanner;

public class RandomListFacade {
    Scanner scn = new Scanner(System.in);
    private static int min;


    private static int size;
    private static int max;

    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void printRandomEvenList(){
        RandomList randomList = new RandomList();
        ListFilter listFilter = new ListFilter();
        ListPrinter listPrinter = new ListPrinter();
        //Create random list
        List<Integer> myList = randomList.generateList(size,min,max);
        //List Filter Odd numbers
        List<Integer> filtedList = listFilter.filterOdd(myList);
        //List printer
        listPrinter.printList(filtedList);

    }

}
