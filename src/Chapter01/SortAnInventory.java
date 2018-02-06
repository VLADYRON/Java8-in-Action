package Chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAnInventory {

    public static void main(String... args) {

        List<Apple> inventory = new ArrayList<>();

        // Creating an inventory of apple with decreasing order of weight
        for (int i=9; i>=1; i--) {
            Apple apple = new Apple(i);
            inventory.add(apple);
        }

        // Sorting using older method of Collections API
        sortOldMethod(inventory);

        // Sorting using Java8 method
        inventory.sort(Comparator.comparing(Apple::getWeight));

        for (Apple apple : inventory) {
            System.out.print(apple.getWeight() + " ");
        }
    }

    private static void sortOldMethod(List<Apple> inventory) {

        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2){
                return a1.getWeight() - a2.getWeight();
            }
        });
    }
}
