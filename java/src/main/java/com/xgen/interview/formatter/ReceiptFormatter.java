package com.xgen.interview.formatter;

import com.xgen.interview.ShoppingCart;

public class ReceiptFormatter {

    public static void format(ShoppingCart shoppingCart, Formatter formatter) {
        String[] keys = shoppingCart.getContents().keySet().toArray(new String[0]);

        for (String key : keys) {
            int price = shoppingCart.getPricer().getPrice(key) * shoppingCart.getContents().get(key);
            float priceFloat = (float) price / 100;
            String priceString = String.format("€%.2f", priceFloat);
            formatter.printPrice(shoppingCart, key, priceString);
        }

        String priceString = String.format("€%.2f", shoppingCart.getTotal());
        formatter.printTotalPrice(priceString);
    }
}
