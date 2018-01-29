package com.company;

/**
 * Created by ian on 2016-01-16.
 */
public class product {

    double getCost() { return units * ppu; }

    int units;
    product(String line) {

        String[] s = line.split(",");
        units = Integer.parseInt(s[0]);
        ppu = Double.parseDouble(s[1]);

    }

    double ppu;
}
