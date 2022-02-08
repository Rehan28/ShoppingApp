package com.rehan.game.Chp7;

public class Product {
    //add
    private static final int Shipping_rate = 5;
    private static final double Dimension_Charge = 1.5;

    private final String name;
    private final int weight;
    private final Dimension dimension;
    private int price;
    private int discount;

    public Product(String name,int price,int discount,int weight,Dimension dimension){
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.weight = weight;
        this.dimension = dimension;
    }
    public int getPrice(){
        double price = this.price*((100 - discount)/100);
        price += weight*Shipping_rate;
        if(dimension.getVolum()>10){
            price += dimension.getVolum()*Dimension_Charge;
        }

        return (int)price;
    }


    @Override
   public String toString(){
       return "Product{ name = '"+name + '\'' +", price = "+price+'}';
   }
}
