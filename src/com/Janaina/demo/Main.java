package com.Janaina.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static com.Janaina.demo.GetGroceries.getGroceries;
import static com.Janaina.demo.GetInput.scannerText;
import static com.Janaina.demo.RemoveGroceries.removeGroceries;
import static com.Janaina.demo.TestLists.arrayListMethod;
import static com.Janaina.demo.TestLists.linkedListMethod;

public class Main {
    public static void main(String[] args) {

       // arrayListMethod();
       // linkedListMethod();
        /*
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            studentList.add(new Student("Benny", 18));
        }

         */

        List<String> shoppingList = new ArrayList<>();

        System.out.println("Let's get started on your shopping! Type 'stop' when finished");
        System.out.println("'add' to add something to your list \n'remove' to remove something from your list \n'view' to view your entire list.");

        boolean isShopping = true;
        do {
            System.out.println("Main menu:");
            switch (scannerText()) {
                case "add" -> getGroceries(shoppingList);
                case "remove" -> removeGroceries(shoppingList);
                case "view" -> System.out.println(shoppingList);
                case "stop" -> isShopping = false;
                default -> System.out.println("I didn't quite understand that, try again");
            }
        }while (isShopping);


    }

}



