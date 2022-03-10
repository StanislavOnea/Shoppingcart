package com.xgen.interview.formatter;

import com.xgen.interview.ShoppingCart;

//This is my Strategy pattern implementation for
public interface Formatter {
     void printTotalPrice(String priceString);

     void printPrice(ShoppingCart shoppingCart, String key, String priceString);
}
