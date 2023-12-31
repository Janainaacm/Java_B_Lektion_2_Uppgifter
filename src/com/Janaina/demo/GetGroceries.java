package com.Janaina.demo;

import java.util.List;
import java.util.Objects;

import static com.Janaina.demo.GetInput.scannerText;

public class GetGroceries {

    public static void getGroceries(List<String> shoppingList){

        System.out.println("What would you like to add to your shopping list? type 'done' when finished.");

        boolean isPlaying = true;

        do {

            String groceries = scannerText();

            if (Objects.equals(groceries, "done")) {
                isPlaying = false;
                break;
            } else {
                shoppingList.add(groceries);
            }

        } while (isPlaying);


    }

}
