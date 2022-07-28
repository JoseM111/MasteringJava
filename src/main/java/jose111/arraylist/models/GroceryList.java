package jose111.arraylist.models;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static java.text.MessageFormat.format;

public class GroceryList {
    /**
     * ArrayList can hold objects & is actually a class
     * */
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println(
            format("* you have ({0}) items in your cart", groceryList.size()));

        IntStream.range(0, groceryList.size())
                 .mapToObj(
                     (index) -> format("{0}. {1}", (index + 1), groceryList.get(index)
                     ))
                 .forEach((element) -> System.out.println(element));
    }

    public void modifyGroceryItem(int position, String newItem) {
        /**
         * @set: Replaces the element at the specified
         * position in this list with the specified element
         */
        groceryList.set(position, newItem);
        System.out.println(
            format("*. grocery item in position ({0}) has been modified.", (position + 1)));
    }

    public void removeGroceryItem(int position) {
        /**
         * @get: Returns the element at the
         * specified position in this list.
         * @remove: Removes the first occurrence of the specified
         * element from this list, if it is present. If the list
         * does not contain the element, it is unchanged.
         */
        var retrievedItemPosition = groceryList.get(position);
        groceryList.remove(retrievedItemPosition);
        System.out.println(format("*. Item removed: ({0})", retrievedItemPosition));
    }

    public String findItem(String searchItem) {
        /**
         * @conatains: Returns true if this list contains the
         * specified element. More formally, returns true if
         * and only if this list contains at least one element
         * e such that Objects.
         */
        //        boolean doesExist = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        return (position >= 0) ? groceryList.get(position) : null;
    }
}









