package com.xgen.interview;

import com.xgen.interview.formatter.PriceFirst;

public class MyTest {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new Pricer());

        shoppingCart.addItem("banana", 1);
        shoppingCart.addItem("apple", 2);
        shoppingCart.addItem("apple", 1);

        shoppingCart.addItem("apple", 1);
        shoppingCart.addItem("banana", 1);

        shoppingCart.printReceipt(new PriceFirst());
    }
}
