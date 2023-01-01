package com.saumya;

import java.util.HashMap;

public class hashmap_intro {
    public static void main(String[] args) {
        //map is just a set of a key and a value
        //if I want to make map of employee and ID then we can say that his name can be key and ID as value
        //Syntax
        HashMap<String , Integer> empIds = new HashMap<>();
        //we have to specify the type of key and value within <>

        //adding new mapping into this we use put function
        empIds.put("Sam",244);
        empIds.put("Tom",212);
        System.out.println(empIds);
        //{Tom=212, Sam=244}
        //Map doesn't gaurantee the order here , only the key gets linked with value is taken into concern

        //Getting values
        System.out.println(empIds.get("Sam")); //244
        System.out.println(empIds.get("kane")); //null

        // some other methods
        //to check if certain key or value exists in our map

        System.out.println(empIds.containsValue(244)); //true
        System.out.println(empIds.containsValue(232)); //false
        System.out.println(empIds.containsKey("Sam")); //true
        System.out.println(empIds.containsKey("kane")); //false

        // we can override the value for the same key(updating key value)
        empIds.put("Sam",232);
        System.out.println(empIds); //{Tom=212, Sam=232}

        //to replace value
        empIds.replace("Tom",265);
        System.out.println(empIds); //{Tom=265, Sam=232}
        empIds.replace("john",211);
        System.out.println(empIds); //replace method can only replace the value if it exists i.e. o/p remains same here

        //updating key value pair if it isnt in our map
        empIds.putIfAbsent("Steve",293);
        System.out.println(empIds); //{Tom=265, Steve=293, Sam=232}

        //removing value
        empIds.remove("Steve");
        System.out.println(empIds); //{Tom=265, Sam=232}
    }
}
