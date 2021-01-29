package org.launchcode.java.restaurant;

public class MenuItem {

    private double price=0;
    private String description="";
    private String category;
    private String name="";
    private String date="";

   public MenuItem(String name)
   {
       this.name=name;
   }

    public MenuItem(String name, double price, String description, String category, String date) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name=name;
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDate(String date) { this.date = date; }

    public String getName() { return name; }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public String getDate() { return date; }

    @Override
    public String toString() {
        return this.name;
    }
}
