package com.company;

public class InvoiceClass {

    public static void main(String[] args) {
	// write your code here
        // TODO code application logic here
        Lineitem lineitem1 = new Lineitem("harry", "book", 10, 2);
        Lineitem lineitem2 = new Lineitem("potter", "dish", 20,3);//
        Lineitem lineitem3 = new Lineitem("banana", "food", 2,10);//.

        System.out.println(lineitem1.getName() + "\t" + lineitem1.getDescription() + "\t"
                + lineitem1.getPrice() +"\t" + lineitem1.getQuantity() +
                "\t" + lineitem1.getinvoice());//getNAm()
        System.out.println(lineitem2.getName() + "\t" + lineitem2.getDescription()+ "\t"
                + lineitem2.getPrice() + "\t" + lineitem2.getQuantity()+
                "\t" + lineitem2.getinvoice()); //getQuantitity qantity quauntity
        System.out.println(lineitem3.getName() + "\t" + lineitem3.getDescription() + "\t"
                + lineitem3.getPrice() + "\t" + lineitem3.getQuantity() +
                "\t"+ lineitem3.getinvoice());
        //]

        // System.out.print("total is: " + lineitem1.getinvoice() +
        //         lineitem2.getinvoice()+ lineitem3.getinvoice());//ome invoie
        double total = lineitem1.getinvoice() +
                lineitem2.getinvoice()+ lineitem3.getinvoice();
        System.out.print("total is: " + total);
    }
}
