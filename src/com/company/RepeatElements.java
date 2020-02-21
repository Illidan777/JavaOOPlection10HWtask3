package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatElements {
    public static Map<Integer, Integer>returnSameElements(List<Integer> list){
        Map<Integer, Integer> statictic = new HashMap<>();
        for (Integer element:list) {
            Integer tempalate = statictic.get(element);
            if(tempalate==null){
                statictic.put(element,1);
            }else{
                statictic.put(element,tempalate+1);
            }
        }
        return statictic;
    }
}
