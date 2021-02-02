package org.launchcode.java.restaurant;
import java.util.ArrayList;
import java.util.Date;
import java.text.*;
import java.io.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Date yourDate = new Date();
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        String date = DATE_FORMAT. format(yourDate);

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Chicks plate", 8.99, " 3 chicken fingers, a drink and a side", "main course", date));
        menu.add(new MenuItem("Slims plate", 11.59, " 5 chicken fingers, a drink and a side", "main course", date));
        menu.add(new MenuItem("Hungry plate", 15.99, " 7 chicken fingers, a drink and a side", "main course", date));
        menu.add(new MenuItem("Fries", 4.99, "Box of fries", "appetizer", date));
        menu.add(new MenuItem("Fried Mushroom", 3.99, "Fried and Seasoned Mushrooms", "appetizer", date));
        menu.add(new MenuItem("Drink", 2.99, "Coke/Sprite/Dr.Pepper/Fanta", "dessert", date));
        menu.add(new MenuItem("Apple pie", 6.99, "Jar of apple pie", "dessert", date));
        menu.add(new MenuItem("Chicks plate", 8.99, " 3 chicken fingers, a drink and a side", "main course", date));





        Menu wholeMenu = new Menu();
        boolean end = true;
        while(end) {

            System.out.println("\nRestaurant Application\n");
            System.out.println("1. Display the whole menu\n2. Display single item in the menu\n3. Add item in the menu\n4. Remove item from the menu\n5. Check if menu items are equal\n6.Exit");


            System.out.print("\nChoose what you want to do: ");
            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    wholeMenu.display(menu);
                    break;
                case 2:
                    wholeMenu.displayDishes(menu);
                    System.out.print("Enter the dish you want to display from the list: ");
                    Scanner sc1 = new Scanner(System.in);
                    String item = sc1.nextLine();
                    wholeMenu.displayItem(menu, item);
                    break;

                case 3:
                    wholeMenu.addDish(menu);
                    break;

                case 4:
                    wholeMenu.removeDish(menu);
                    break;

                case 5:

                   if(checkEqual(menu) == true)
                   {
                       System.out.println("\nTwo menu items are equal.\n");
                   }
                   else
                   {
                       System.out.println("\nTwo menu items are not equal.\n");

                   }
                    break;
                case 6:
                    end = false;
                    break;
            }


        }
    }

    public static void display(ArrayList<MenuItem> completeMenu)
    {
        System.out.println();

        System.out.println("No.\t"+String.format( "%15s", "Name")+String.format("%25s","Price")+String.format("%40s","Description")+String.format("%15s","Category")+String.format("%20s", "Date-added"));
        System.out.println("___\t"+String.format( "%15s", "_____")+String.format("%25s","_____")+String.format("%40s","___________")+String.format("%15s","________")+String.format("%20s", "_________"));
        System.out.println();

        int i=0;
        for(MenuItem menu: completeMenu) {

            String price = "$"+menu.getPrice();
            System.out.println(i+1+". \t"+String.format( "%15s", menu.toString())+String.format("%25s",price)+String.format("%40s",menu.getDescription())+String.format("%15s",menu.getCategory())+String.format("%20s",menu.getDate()));
            i++;
        }

        System.out.println();
    }



    public static void displayItem(ArrayList<MenuItem> completeMenu, String item)

    {
        System.out.println(item);
        for(MenuItem menu: completeMenu) {

            if(menu.toString().equals(item))
            {

                String price = "$"+menu.getPrice();
                System.out.println(String.format( "%15s", "Name")+String.format("%25s","Price")+String.format("%40s","Description")+String.format("%15s","Category")+String.format("%20s", "Date-added"));
                System.out.println(String.format( "%15s", "_____")+String.format("%25s","_____")+String.format("%40s","___________")+String.format("%15s","________")+String.format("%20s", "_________"));
                System.out.println();
                System.out.println(String.format( "%15s", menu.toString())+String.format("%25s",price)+String.format("%40s",menu.getDescription())+String.format("%15s",menu.getCategory())+String.format("%20s",menu.getDate()));
                System.out.println();
                System.out.println();


            }

        }
    }

    public static void displayDishes(ArrayList<MenuItem> completeMenu)
    {
        System.out.println();

        int i=0;
        for(MenuItem menu: completeMenu) {

            String price = "$"+menu.getPrice();
            System.out.println(String.format( "%15s", menu.toString()));
        }
        System.out.println();
    }

    public void addDish(ArrayList<MenuItem> completeMenu)
    {
        System.out.println();
        int len=completeMenu.size();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of the item: ");
        String name = sc.nextLine();

        Scanner temp1 = new Scanner(System.in);
        System.out.print("\nEnter the price of the item: ");
        double price = temp1.nextDouble();

        Scanner temp2 = new Scanner(System.in);
        System.out.print("\nEnter Description for the item: ");
        String desc = temp2.nextLine();

        Scanner temp3 = new Scanner(System.in);
        System.out.print("\nenter the category of the item: ");
        String category = temp3.nextLine();



        Date yourDate = new Date();
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        String date = DATE_FORMAT. format(yourDate);

        MenuItem item = new MenuItem(name);
        item.setPrice(price);
        item.setCategory(category);
        item.setDescription(desc);
        item.setDate(date);

        completeMenu.add(item);



    }

    public static void removeDish(ArrayList<MenuItem> completeMenu) {

        displayDishes(completeMenu);

        System.out.print("Enter the dish you want to display from the list: ");
        Scanner temp4 = new Scanner(System.in);
        String item = temp4.nextLine();

        MenuItem buffer=null;

        for(MenuItem menu: completeMenu) {

            if(menu.toString().equals(item))
            {
                buffer=menu;
            }


        }

        completeMenu.remove(buffer);


    }

    public static boolean checkEqual(ArrayList<MenuItem> wholeMenu)
    {
        System.out.println("\nAvailable Dishes\n");
        displayDishes(wholeMenu);
        System.out.print("Select first dish: ");
        Scanner sc1 = new Scanner(System.in);
        String firstchoice = sc1.nextLine();
        System.out.print("Select second dish: ");
        Scanner sc2 = new Scanner(System.in);
        String secondchoice = sc2.nextLine();

        if (firstchoice.equals(secondchoice))
        {
            return true;
        }
        return false;
    }

}
