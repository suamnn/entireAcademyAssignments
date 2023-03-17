package com.entireAcademy.Day7.CollectionPart1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionClassNote {
    public static void main(String[] args) {
//    for (dataType variableName : collection) {
//
//    }

//        String[] words = {"Hello", "world"};
//
//        for (String word : words) {
//            System.out.println(word);
//        }

//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Bishal");
//        names.add("Parvati");
//        names.add("Parvati");
//////
////        names.remove(0);
//////
////        boolean hasName = names.contains("Bishal");
////        System.out.println(hasName);
//        names.set(2, "Joshnson");
//
//        for(String name : names) {
//            System.out.println(name);
//        }

        // Autoboxing and Unboxing
//        int number = 100;
//        Integer num = number;
//
//        System.out.println(num);

//        Integer rollNum = 10;
//        int studentNumber = rollNum;
//
//        System.out.println(studentNumber);

//        boolean tf = true;
//        Boolean bol = tf;

        // Queues
        Queue<String> names = new LinkedList<String>();
        names.add("Student 1");
        names.add("Student 2");
        names.add("Student 3");
        names.add("Student 4");

//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();

        boolean empty = names.isEmpty();


//        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }


    }


}
