package intermediate.collections;

import java.util.ArrayList;
import java.util.List;

/* Use ArrayList to manage a list of grocery items.
Features:
Add, remove, and update items in the list.
Sort the list alphabetically.*/
public class GroceryListOrganizer {
    public static void main(String[] args) {

        List<String> groceryitems = new ArrayList<>();

//        adding items
        groceryitems.add("sunflower oil");
        groceryitems.add("eggs");
        groceryitems.add("brown bread");
        groceryitems.add("dish washer");
        groceryitems.add("fruits");
        groceryitems.add("seeds and nuts");
        System.out.println("Print all grocery items: \n"+groceryitems);

//        removing items
        try {
            groceryitems.remove(3);
            groceryitems.remove(4);
            System.out.println("List after removing items: \n" + groceryitems);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: Index can be out of bounds. Enter correct index.");
        }

//        updating items
        if (groceryitems.contains("fruits")){
            int index = groceryitems.indexOf("fruits");
            groceryitems.remove(index);
            groceryitems.add("Bananas");
        }
        System.out.println("After updation: \n"+groceryitems);

//        size of list
        System.out.println("Size of List: \n"+groceryitems.size());
    }
}
