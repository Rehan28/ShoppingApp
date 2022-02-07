package com.rehan.game.Chp7;

import java.util.ArrayList;

public class ShoppingCard {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){

        products.add(product);
    }
    public int getTotalPrice(){
        int totalPrice = 0;
        for(Product i : products){
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString(){
        return "ShoppingCard{ products = "+products+'}';
    }
}
