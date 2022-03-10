package com.xgen.interview.formatter;

import com.xgen.interview.ShoppingCart;

public class NameFirst implements Formatter{

    @Override
    public void printTotalPrice(String priceString) {
        System.out.println("Total - " + priceString);
    }

    @Override
    public void printPrice(ShoppingCart shoppingCart, String key, String priceString) {
        System.out.println(key   + " - " + shoppingCart.getContents().get(key) + " - " + priceString);
    }
}
