package org.launchcode.java.restaurant;

public class MenuItem {

    double price=0;
    String description="";
    String category;
    String name="";

    public MenuItem(String name, double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

}
