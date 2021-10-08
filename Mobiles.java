package com.Java_Practice;

import java.util.Scanner;

public class Mobiles {
    private  String Brand;
    private int price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static String name = "apple";

    public static void main(String[] args) {

        String s =
        Mobiles.name;

        String printStatement="Enter the brand name here : ";
        Scanner in = new Scanner(System.in);
        System.out.print(printStatement);
        String name = in.next();
        in.nextLine();
        Mobiles Brand_name1 = new Mobiles();
        Brand_name1.setBrand(name);

        System.out.print("Enter the brand name here : ");
        String name1 = in.next();
        Mobiles Brand_name2 = new Mobiles();
        Brand_name1.setBrand(name1);

        System.out.print("Enter the brand price here : ");
        int price = in.nextInt();
        Mobiles Brand_price1 = new Mobiles();
        Brand_price1.setPrice(price);

        System.out.print("Enter the brand price here : ");
        int price1 = in.nextInt();
        Mobiles Brand_price2 = new Mobiles();
        Brand_price2.setPrice(price);

        System.out.println("The Brand_name is : " + Brand_name1.getBrand() + " and " + " The Brand_price is : " + Brand_price1.getPrice());

    }
    public static void price_comparison( ) {

    }
}
