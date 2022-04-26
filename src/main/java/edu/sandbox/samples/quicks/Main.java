package edu.sandbox.samples.quicks;

import java.text.DecimalFormat;

public class Main {

    public static void main(String... args) {
        double d = 23.00000000;
        double e = 23.00000;
        var df = new DecimalFormat("#.####");
        boolean flag = df.format(d).equals(df.format(e));
        System.out.println(flag);
    }
}
