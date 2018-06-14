package com.company;

public class Lineitem {
    String name;
    String description;
    double price;
    int quantity;

    Lineitem(String n, String d,double p, int q) { //description quantity
        name = n;
        description = d;
        price = p;
        quantity = q;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        //this.name = name;
        name = n;
    }
    public String getDescription() {
        return description;
    }//pipuplic
    public void setDescription(String d) {
        description = d;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) { //ernter!!!
        price = p;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQauntity(int q) {
        quantity = q;
    }

    public double getinvoice() {
        return price * quantity;
    }
}
