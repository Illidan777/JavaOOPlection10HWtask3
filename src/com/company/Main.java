package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        RepeatElements repeatElements = new RepeatElements();
        for (int index =0;index<=10;index++){
            list.add((int)(Math.random()*10));
        }
        System.out.println(list);
        System.out.println(repeatElements.returnSameElements(list));
    }
}
