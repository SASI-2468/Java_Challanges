package com.Java_Practice;

public class Product {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product p1  = new Product();
        p1.setPrice(12);

        Product p2 = new Product();
        p2.setPrice(15);
        Product p3  = new Product();
        p3.setPrice(12);
        Product p4 = new Product();
        p4.setPrice(15);

        /*Product.price_comparision(p1.getPrice(),p2.getPrice());
        price_comparision(1,2);

        sysout(price_comparision(p3.getPrice(),p4.getPrice()));*/



        price_comparision_object(p1,p2);


    }
    public static int price_comparision(int price_one , int price_two){

        if (price_one>price_two){
            System.out.println(price_one);

            return price_one;
        }else{
            System.out.println(price_two);
            return  price_two;
        }

    }
    public static void price_comparision_object(Product product1, Product product2){

        if (product1.getPrice()>product2.getPrice()){
            System.out.println(product1.getPrice());
        }else{
            System.out.println(product2.getPrice());
        }

    }
}
