package org.launchcode.java.restaurant;
import java.time.Instant;
import java.util.Date;

public class Menu {
    public static void main(String[] args) {

        int count=-1;
        MenuItem[] menu = new MenuItem[50];

        menu[++count] = new MenuItem("Chicks plate", 8.99, " 3 chicken fingers, a drink and a side", "main course");
        menu[++count] = new MenuItem("Slims plate", 11.59, " 5 chicken fingers, a drink and a side", "main course");
        menu[++count] = new MenuItem("Hungry plate", 15.99, " 7 chicken fingers, a drink and a side", "main course");
        menu[++count] = new MenuItem("Fries", 4.99, "Box of fries", "appetizer");
        menu[++count] = new MenuItem("Fried Mushroom", 3.99, "Mushrooms fries and seasoned", "appetizer");
        menu[++count] = new MenuItem("Drink", 2.99, "Coke/Sprite/Dr.Pepper/Fanta", "dessert");
        menu[++count] = new MenuItem("Apple pie", 6.99, "Jar of apple pie", "dessert");

        System.out.println("");

        System.out.println("No.\t"+String.format( "%15s", "Name")+String.format("%15s","Price")+String.format("%40s","Description")+String.format("%15s","Category")+String.format("%40s", "Date-added"));
        System.out.println();

        Date date = new Date();

        for(int i=0; i<count;i++) {

            String price = "$"+String.valueOf(menu[i].getPrice());

            System.out.println(i+1+". \t"+String.format( "%15s", menu[i].getName())+String.format("%15s",price)+String.format("%40s",menu[i].getDescription())+String.format("%15s",menu[i].getCategory())+String.format("%40s",date));

        }



        System.out.println();
        System.out.println();


    }
}
