package com.xgen.interview.formatter;

import com.xgen.interview.ShoppingCart;

public class PriceFirst implements Formatter{

    @Override
    public void printTotalPrice(String priceString) {
        System.out.println(priceString + " - Total");
    }

    @Override
    public void printPrice(ShoppingCart shoppingCart, String key, String priceString) {
        System.out.println(priceString  + " - " + shoppingCart.getContents().get(key) + " - " + key);
    }
}
