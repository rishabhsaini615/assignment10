package com.assignment10.util;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConvertor {
    public static String formatOfCurrency(double amount){
        Locale cad = new Locale("EN","CA");
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(cad);
        return defaultFormat.format(amount);
    }
}

