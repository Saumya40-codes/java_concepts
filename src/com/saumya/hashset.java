package com.saumya;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("sam");
        set.add("kane");
        set.add("paine");
        set.add("james");
        set.add("sam");

        set.remove("paine");


        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("paine"));

        System.out.println();


        for(String s: set){
            System.out.println(s);
        }

        System.out.println();

        set.forEach(System.out::println);

        System.out.println();
        Iterator<String> setIterator = set.iterator();

        while(setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        System.out.println();

        set.clear();
        System.out.println(set);

        Queue<Integer> q = new LinkedList<>();

        //using hashset to remove duplicates
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(3);
        System.out.println(list);
        System.out.println();
        Set<Integer> h_set = new HashSet<>(list);
        System.out.println(h_set);
        //adding and removal in hashset happens in O(1) time

        /*
        Other then hashset set also contains : Treeset and LinkedHashSet
         */
        //Tree set, as name suggest for instance entities are arranged in type of tree so in terms of string elements are ordered in alphabetical order
        //In linked set, element are ordered in insertion order
        // Hashset is fastest than both of this
    }
}
