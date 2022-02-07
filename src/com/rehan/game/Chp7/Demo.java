package com.rehan.game.Chp7;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();

        Product keyboard = new Product("Keyboard",540);
        Product mouse = new Product("Mouse",200);
        Product ecoDot = new Product("Eco Dot",1000);


        shoppingCard.addProduct(keyboard);
        shoppingCard.addProduct(mouse);
        shoppingCard.addProduct(ecoDot);

        System.out.println("shopping card = "+shoppingCard);
        int totalPrice = shoppingCard.getTotalPrice();
        System.out.println("Total Price is = "+totalPrice);
    }
}
