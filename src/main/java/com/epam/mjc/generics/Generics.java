package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {

    //TODO: Refactor Method-1
    public <T> List<T> boxingMethod(String name) {
        List<T> firstList = new ArrayList<>();
        firstList.add((T) name);
        List<T> secondList = new ArrayList<>();
        secondList.add((T) firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <G, U> void cloneMethod(List<G> consumer, List<U> producer) {
        consumer.addAll(producer.stream().map(x -> (G) x).collect(Collectors.toList()));
    }

}
