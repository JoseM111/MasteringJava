package jose111.arraylist;

import jose111.arraylist.models.IHelpers;

public class _ArrayList {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("[  arraylist: EXAMPLE  ]");
        System.out.println("------------------------------------------------");

        boolean quit = false;
        int choice;

        IHelpers.printInstructions();

        while (!quit) {
            System.out.println("*. Enter your choice: ");
            choice = IHelpers.scanner.nextInt();
            // clear the buffered int input
            IHelpers.scanner.nextLine();

            switch (choice) {
                case 0 -> IHelpers.printInstructions();
                case 1 -> IHelpers.groceryList.printGroceryList();
                case 2 -> IHelpers.addItems();
                case 3 -> IHelpers.modifyItem();
                case 4 -> IHelpers.removeItem();
                case 5 -> IHelpers.searchForItem();
                case 6 -> quit = true;
            }
        }
        System.out.println("================================================\n");
    }
}











