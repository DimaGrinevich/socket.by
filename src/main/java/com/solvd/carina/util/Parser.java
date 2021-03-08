package com.solvd.carina.util;

public class Parser {

    private Parser() {
    }

    public static double parsePriceToDouble(String priceStr) {
        String tmp = priceStr.replace(" ", "");

        String left = tmp.substring(0, tmp.indexOf("руб."));

        String right = tmp.substring(tmp.indexOf("руб.") + 4, tmp.indexOf("коп."));

        double result = Double.parseDouble(left + "." + right);

        return result;
    }

    public static double connectRublesAndPenny(String rubles, String penny) {
        rubles = rubles.replace(" ", "");
        penny = penny.replace(" ", "");
        return Double.parseDouble(rubles + "." + penny);
    }
}
