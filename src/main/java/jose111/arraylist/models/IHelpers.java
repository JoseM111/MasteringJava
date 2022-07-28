package jose111.arraylist.models;

import java.util.Scanner;

import static java.text.MessageFormat.format;

public interface IHelpers {
    /**
     * @System.in: The "standard" input stream.
     */
    Scanner scanner = new Scanner(System.in);
    GroceryList groceryList = new GroceryList();

    static void printInstructions() {
        System.out.println(
            """
            *. Press
                0 - to print choice options:
                1 - to print the list of groceries:
                2 - to add an item to the list:
                3 - to modify an item in the list:
                4 - to remove an item from the list:
                5 - to search for an item on the list:
                6 - to quit the application:
            """.trim()
        );
    }

    static void addItems() {
        System.out.println("*. Enter new grocery item to the list: ");
        // input
        groceryList.addGroceryItem(scanner.nextLine());
    }

    static void modifyItem() {
        System.out.println("*. Enter item number you want to modify: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("*. Enter item you want replaced: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    static void removeItem() {
        System.out.println("*. Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        // starts at index: `0, 1, 2` but in the output starts at `1`
        // so we have to subtract `-1` to get it back to `0, 1, 2`
        groceryList.removeGroceryItem(itemNo - 1);
    }

    static void searchForItem() {
        System.out.println("*. Enter item you are searching for: ");
        String searchItem = scanner.nextLine();

        System.out.println(
            (groceryList.findItem(searchItem) != null)
            ? format("*. Found {0} in the grocery list.", searchItem)
            : format("*. {0} is not in the shopping list.", searchItem)
        );
    }
}





