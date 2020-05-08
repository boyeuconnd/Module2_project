package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    static RandomListFacade randomListFacade = new RandomListFacade();
    public static void main(String[] args) {
	// write your code here
        setStatic();
        randomListFacade.printRandomEvenList();
    }



    private static void setStatic(){
        System.out.print("Enter min value:");
        int min = scn.nextInt();
        randomListFacade.setMin(min);
        System.out.print("Enter max value:");
        int max = scn.nextInt();
        randomListFacade.setMax(max);
        System.out.print("Enter list size");
        int size = scn.nextInt();
        randomListFacade.setSize(size);
    }
}
