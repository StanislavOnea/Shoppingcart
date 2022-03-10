package com.xgen.interview;

import com.xgen.interview.formatter.Formatter;
import com.xgen.interview.formatter.NameFirst;
import com.xgen.interview.formatter.PriceFirst;

import java.util.*;

import static com.xgen.interview.formatter.ReceiptFormatter.*;


/**
 * This is the current implementation of ShoppingCart.
 * Please write a replacement
 */

public class ShoppingCart implements IShoppingCart {
    private HashMap<String, Integer> contents = new LinkedHashMap<>();
    private Pricer pricer;
    private float total = 0;

    public ShoppingCart(Pricer pricer) {
        this.pricer = pricer;
    }

    public void addItem(String itemType, int number) {
        if (!contents.containsKey(itemType)) {
            contents.put(itemType, number);

        } else {
            int existing = contents.get(itemType);
            contents.put(itemType, existing + number);
        }
        total += (float)(pricer.getPrice(itemType) * number) / 100;
    }

    //I used polymorphism to implement formatting be default first comes names and after the price
    //what format we want to use
    public void printReceipt() {
        NameFirst formatter = new NameFirst();
        printReceipt(formatter);
    }

    //Although we can specify the format
    public void printReceipt(NameFirst formatter) {
        format(this, formatter);
    }

    public void printReceipt(PriceFirst priceFirst) {
        Formatter formatter = new PriceFirst();
        format(this, formatter);
    }

    public HashMap<String, Integer> getContents() {
        return contents;
    }

    public Pricer getPricer() {
        return pricer;
    }

    public float getTotal() {
        return total;
    }
}
