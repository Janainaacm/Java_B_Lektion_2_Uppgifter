package com.Janaina.demo;

import java.util.List;
import static com.Janaina.demo.GetInput.scannerText;

public class RemoveGroceries {

    public static void removeGroceries(List<String> shoppingList){

        System.out.println("What would you like to remove from your shopping list?");

        String elementToRemove = scannerText();
        shoppingList.remove(elementToRemove);


    }


}
