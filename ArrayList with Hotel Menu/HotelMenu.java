import java.util.ArrayList;

public class HotelMenu {
    public static void main(String[] args) {

        // Create a variable called menuTitle of type String and assign it the value "My
        // Dream Menu:".
    String menuTitle = "My Dream Menu :" ;

        // Print the menuTitle variable to the console.
    System.out.println(menuTitle);

        // Create a variable called menu of type ArrayList.
    ArrayList<MenuItem> menu = new ArrayList<>();

        // Create a variable called starter of type MenuItem and pass in the name of
        // your favourite starter.
    MenuItem starter = new MenuItem("Starter = Tanduri Chicken");

        // Add the starter variable to the ArrayList called menu.
    menu.add(starter);

        // Create a variable called mainCourse of type MenuItem and pass in the name of
        // your favourite main course.
    MenuItem mainCourse  = new MenuItem("Main Course = Roti With Chicken Gravy");

        // Add the mainCourse variable to the ArrayList called menu.
    menu.add(mainCourse);

        // Create a variable called dessert of type MenuItem and pass in the name of
        // your favourite dessert.
    MenuItem dessert = new MenuItem("Desert = Ice Cream");

        // Add the dessert variable to the ArrayList called menu.
    menu.add(dessert);

        // Print the menu variable to the console.
        System.out.println(menu);
      }
    }
    
