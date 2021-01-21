package org.launchcode.java.restaurant;

public class Menu {
    public static void main(String[] args) {

        int count=0;
        MenuItem[] menu = new MenuItem[50];

        menu[count++] = new MenuItem("Chicks plate", 8.99, " 3 chicken fingers, a drink and a side", "main course");
        menu[count++] = new MenuItem("Slims plate", 11.59, " 5 chicken fingers, a drink and a side", "main course");
        menu[count++] = new MenuItem("Hungry plate", 15.99, " 7 chicken fingers, a drink and a side", "main course");
        menu[count++] = new MenuItem("Fries", 4.99, "Box of fries", "appetizer");
        menu[count++] = new MenuItem("Fried Mushroom", 3.99, "Mushrooms fries and seasoned", "appetizer");
        menu[count++] = new MenuItem("Drink", 2.99, "Coke/Sprite/Dr.Pepper/Fanta", "dessert");
        menu[count++] = new MenuItem("Apple pie", 6.99, "Jar of apple pie", "dessert");


        for(int i=0; i<menu.length;i++)        {
        }
        System.out.println();
        System.out.println();


    }
}
